package com.tomshumi.atHomePartyBackend.config

import com.tomshumi.atHomePartyBackend.filter.LoggingFilter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.GenericFilterBean

@Configuration
class FilterConfig {

    @Bean
    fun loggingFilter(): GenericFilterBean {
        return LoggingFilter()
    }
}