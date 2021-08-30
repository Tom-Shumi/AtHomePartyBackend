package com.tomshumi.atHomePartyBackend.mapper

import com.tomshumi.atHomePartyBackend.bean.entity.DrinkRecord
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import java.time.LocalDate

@Mapper
interface PickupDrinkMapper {

    // ピックアップドリンク取得（取得順の指定無し）
    @Select("SELECT d.* FROM pickup_drink pd INNER JOIN drink d ON pd.drink_id = d.id")
    fun find(): List<DrinkRecord>
}