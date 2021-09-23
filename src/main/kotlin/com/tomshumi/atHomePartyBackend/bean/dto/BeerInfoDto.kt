package com.tomshumi.atHomePartyBackend.bean.dto

data class BeerInfoDto(
    val id: Int,
    val name: String,
    val description: String?,
    val drinkCategoryId1: Int,
    val drinkCategoryId2: Int,
    val infoUrl: String?,
    val alcohol: Short,
    val star: Float,
    val bitter: Short,
    val flavor: Short,
    val hop: Short,
    val sharp: Short,
    val body: Short
) {
}