package com.tomshumi.atHomePartyBackend.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.tomshumi.atHomePartyBackend.service.HomeService
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component
import java.util.*
import java.util.concurrent.TimeUnit

@Component
class RedisUtils(
    private val redisTemplate: StringRedisTemplate
) {
    companion object{
        val gson = createGson()

        private fun createGson(): Gson {
            val builder = GsonBuilder();
            builder.serializeNulls();
            return builder.create();
        }
    }

    fun set(key: String, value: Any) {
        set(key, value, null)
    }

    fun set(key: String, value: Any, expireSecond: Long?) {

        redisTemplate.opsForValue().set(key, gson.toJson(value))

        if (expireSecond is Long) {
            redisTemplate.expire(key, expireSecond, TimeUnit.SECONDS);
        }
    }

    fun <T> get(key: String): T? {
        val value: String? = redisTemplate.opsForValue().get(key)

        if (Objects.isNull(value)) return null;

        return gson.fromJson<T>(value, object: TypeToken<T>() {}.type)
    }

    fun hasKey(key: String): Boolean {
        return redisTemplate.hasKey(key)
    }

    fun delete(key: String) {
        redisTemplate.delete(key)
    }

}