package com.tomshumi.atHomePartyBackend.service

import com.tomshumi.atHomePartyBackend.bean.dto.BeerInfoDto
import com.tomshumi.atHomePartyBackend.bean.dto.BeerSearchConditionDto
import com.tomshumi.atHomePartyBackend.mapper.BeerMapper
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BeerService(
    private val beerMapper: BeerMapper
) {

    fun getList(beerSearchCondition: BeerSearchConditionDto, pageable: Pageable): List<BeerInfoDto> {
      return beerMapper.getList(beerSearchCondition, pageable)
    }
}