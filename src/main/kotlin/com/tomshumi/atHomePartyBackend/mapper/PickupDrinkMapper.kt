package com.tomshumi.atHomePartyBackend.mapper

import com.tomshumi.atHomePartyBackend.bean.entity.DrinkRecord
import com.tomshumi.atHomePartyBackend.bean.entity.PickupDrinkRecord
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import java.time.LocalDate

@Mapper
interface PickupDrinkMapper {

    // ピックアップドリンク取得（取得順の指定無し）TODO ランダム取得
    @Select("SELECT * FROM pickup_drink WHERE delete_flg = false")
    fun find(): List<PickupDrinkRecord>
}