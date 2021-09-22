package com.tomshumi.atHomePartyBackend.bean.dto

data class BeerSearchConditionDto(
    val drinkName: String?,
    val order: String?,
    val isDesc: Boolean?
) {
}