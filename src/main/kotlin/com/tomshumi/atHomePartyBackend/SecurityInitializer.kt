package com.tomshumi.atHomePartyBackend

import com.tomshumi.atHomePartyBackend.config.SecurityConfig
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer

class SecurityInitializer :
    AbstractSecurityWebApplicationInitializer(SecurityConfig::class.java) {
}