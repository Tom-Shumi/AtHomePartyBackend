package com.tomshumi.atHomePartyBackend.controller

import com.tomshumi.atHomePartyBackend.bean.dto.BeerSearchConditionDto
import com.tomshumi.atHomePartyBackend.bean.response.BeerListResponse
import com.tomshumi.atHomePartyBackend.bean.response.HomeResponse
import com.tomshumi.atHomePartyBackend.service.BeerService
import com.tomshumi.atHomePartyBackend.service.HomeService
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drink/beer")
class BeerController(
    private val beerService: BeerService
) : BaseController() {

    /**
     * ビール一覧の取得
     */
    @GetMapping
    fun getList(beerSearchCondition: BeerSearchConditionDto,
             pageable: Pageable): ResponseEntity<String> {
        val beerListResponse = BeerListResponse(beerService.getList(beerSearchCondition, pageable))
        beerListResponse.setMaxPage(beerService.getListCount(beerSearchCondition))

        return createResponseEntity(HttpStatus.OK, gson.toJson(beerListResponse))
    }
}