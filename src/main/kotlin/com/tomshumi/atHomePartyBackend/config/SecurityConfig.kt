package com.tomshumi.atHomePartyBackend.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@Configuration
@EnableWebSecurity
class SecurityConfig: WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity){
        http
            .authorizeRequests()
            .mvcMatchers("/**").permitAll()

        http.csrf().disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        // デフォルトのユーザを削除してログに表示されないようにする
        auth?.inMemoryAuthentication()
    }
}