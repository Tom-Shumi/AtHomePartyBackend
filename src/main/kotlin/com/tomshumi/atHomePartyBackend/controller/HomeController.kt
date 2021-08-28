package com.tomshumi.atHomePartyBackend.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.util.CollectionUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController: BaseController() {

    /**
     * ホーム表示情報取得
     */
    @GetMapping
    fun home(): ResponseEntity<String> {
        return createResponseEntity(HttpStatus.OK, "test")
    }
}