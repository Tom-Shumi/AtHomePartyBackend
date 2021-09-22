package com.tomshumi.atHomePartyBackend.service

import com.tomshumi.atHomePartyBackend.bean.dto.BeerSearchConditionDto
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BeerService {

    fun getList(beerSearchCondition: BeerSearchConditionDto, pageable: Pageable) {

    }
}