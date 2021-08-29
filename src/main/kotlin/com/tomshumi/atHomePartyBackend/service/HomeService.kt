package com.tomshumi.atHomePartyBackend.service

import com.tomshumi.atHomePartyBackend.bean.dto.HomeDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class HomeService {

    fun home(): HomeDto {
        val homeDto = HomeDto()

        // TODO データの取得

        return homeDto
    }
}