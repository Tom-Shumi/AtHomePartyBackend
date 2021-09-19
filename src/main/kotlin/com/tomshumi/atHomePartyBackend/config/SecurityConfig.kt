package com.tomshumi.atHomePartyBackend.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
@EnableWebSecurity
class SecurityConfig: WebSecurityConfigurerAdapter() {

    @Value("\${allow.front.origin}")
    private val FRONT_ORIGIN: String = ""

    override fun configure(http: HttpSecurity){

        http
            .authorizeRequests()
            .mvcMatchers("/**").permitAll()

        http.csrf().disable()
        http.cors().configurationSource(corsConfigurationSource())
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        // デフォルトのユーザを削除してログに表示されないようにする
        auth?.inMemoryAuthentication()
    }

    @Bean
    fun  corsConfigurationSource(): CorsConfigurationSource {

        val corsSource = UrlBasedCorsConfigurationSource()
        corsSource.registerCorsConfiguration("/**", getCorsConfiguration())

        return corsSource
    }

    fun getCorsConfiguration(): CorsConfiguration {
        val corsConfiguration = CorsConfiguration()
        corsConfiguration.addAllowedMethod("GET")
        corsConfiguration.addAllowedMethod("POST")
        corsConfiguration.addAllowedMethod("PUT")
        corsConfiguration.addAllowedMethod("DELETE")
        corsConfiguration.addAllowedMethod("OPTIONS")

        corsConfiguration.addAllowedOrigin(FRONT_ORIGIN)
        corsConfiguration.allowCredentials = true
        return corsConfiguration
    }
}