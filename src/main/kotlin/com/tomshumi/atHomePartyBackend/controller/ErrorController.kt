package com.tomshumi.atHomePartyBackend.controller

import com.tomshumi.atHomePartyBackend.filter.LoggingFilter
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.ServletException

@ControllerAdvice
@Slf4j
class ErrorController: BaseController() {
    companion object {
        private val log = LoggerFactory.getLogger(ErrorController::class.java)
    }

    @ExceptionHandler(Exception::class)
    fun exceptionHandler(e: Exception): ResponseEntity<String> {
        log.error(e.stackTraceToString())
        return createResponseEntity(HttpStatus.BAD_REQUEST, "Bad request")
    }
}