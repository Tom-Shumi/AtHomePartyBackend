package com.tomshumi.atHomePartyBackend.controller

import com.tomshumi.atHomePartyBackend.bean.response.HomeResponse
import com.tomshumi.atHomePartyBackend.service.HomeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController(
    private val homeService: HomeService
): BaseController() {

    /**
     * ホーム表示情報取得
     */
    @GetMapping
    fun home(): ResponseEntity<String> {

        val response = HomeResponse(homeService.home())

        val responseJson = gson.toJson(response)

        return createResponseEntity(HttpStatus.OK, responseJson)
    }
}