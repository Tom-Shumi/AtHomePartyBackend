package com.tomshumi.atHomePartyBackend.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.tomshumi.atHomePartyBackend.service.HomeService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.*
import java.util.concurrent.TimeUnit


@Component
class RedisUtils(
    @Qualifier("redisTemplate")
    private val redisTemplate: StringRedisTemplate,
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

    fun <T> get(key: String, tClass: Class<T>): T? {
        val value: String? = redisTemplate.opsForValue().get(key)

        if (Objects.isNull(value)) return null;

        val type: ParameterizedType = GenericOf(tClass)

        return gson.fromJson<T>(value, type)
    }

    fun hasKey(key: String): Boolean {
        return redisTemplate.hasKey(key)
    }

    fun delete(key: String) {
        redisTemplate.delete(key)
    }

    class GenericOf<T>(private val type: Class<T>) : ParameterizedType {

        override fun getActualTypeArguments(): Array<Type> {
            return Array(1){type}
        }

        override fun getRawType(): Type {
            return type
        }

        override fun getOwnerType(): Type {
            return type
        }
    }
}