package com.tomshumi.atHomePartyBackend.bean.dto

data class BeerSearchConditionDto(
    val drinkName: String?,
    val order: Order = Order.STAR,
    val isDesc: Boolean = true,
    val starFrom: Float?,
    val starTo: Float?,
    val alcoholFrom: Short?,
    val alcoholTo: Short?,
    val bitterFrom: Short?,
    val bitterTo: Short?,
    val flavorFrom: Short?,
    val flavorTo: Short?,
    val hopFrom: Short?,
    val hopTo: Short?,
    val sharpFrom: Short?,
    val sharpTo: Short?,
    val bodyFrom: Short?,
    val bodyTo: Short?
) {

    enum class Order {
        STAR, BITTER, FLAVOR, HOP, SHARP, BODY
    }
}