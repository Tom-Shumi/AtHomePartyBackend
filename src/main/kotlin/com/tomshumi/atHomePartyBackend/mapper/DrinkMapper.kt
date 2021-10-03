package com.tomshumi.atHomePartyBackend.mapper

import com.tomshumi.atHomePartyBackend.bean.entity.DrinkRecord
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface DrinkMapper {

    @Select("SELECT * FROM drink WHERE drink_category_id1 = #{categoryId} ORDER BY star, id DESC LIMIT #{limit} ")
    fun findRanking(@Param("categoryId") categoryId: Int, @Param("limit") limit: Int): List<DrinkRecord>
}