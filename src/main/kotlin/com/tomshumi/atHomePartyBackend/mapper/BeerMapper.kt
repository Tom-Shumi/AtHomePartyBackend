package com.tomshumi.atHomePartyBackend.mapper

import com.tomshumi.atHomePartyBackend.bean.dto.BeerInfoDto
import com.tomshumi.atHomePartyBackend.bean.dto.BeerSearchConditionDto
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.springframework.data.domain.Pageable

@Mapper
interface BeerMapper {

    fun getList(@Param("condition") condition: BeerSearchConditionDto,
                @Param("pageable") pageable: Pageable): List<BeerInfoDto>
}