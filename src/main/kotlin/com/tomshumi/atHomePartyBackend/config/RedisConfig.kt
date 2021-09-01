package com.tomshumi.atHomePartyBackend.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession
import org.springframework.data.redis.core.RedisTemplate




@Configuration
@EnableRedisHttpSession
class RedisConfig {

    @Value("\${spring.redis.host}")
    private lateinit var host: String

    @Value("\${spring.redis.port}")
    private var port: Int = 0

    @Bean
    fun springSessionDefaultRedisSerializer(): RedisSerializer<Any?> {
        return GenericJackson2JsonRedisSerializer()
    }

    @Bean
    fun lettuceConnectionFactory(): LettuceConnectionFactory {
        return LettuceConnectionFactory(host, port)
    }

    @Bean
    fun redisTemplate(): StringRedisTemplate? {
        val redisTemplate = StringRedisTemplate()
        redisTemplate.setConnectionFactory(lettuceConnectionFactory())

        return redisTemplate
    }
}