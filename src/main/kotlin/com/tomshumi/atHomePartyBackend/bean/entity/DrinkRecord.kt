package com.tomshumi.atHomePartyBackend.bean.entity

data class DrinkRecord(
    var id: Int? = null,
    var name: String? = null,
    var description: String? = null,
    var drinkCategoryId1: Int? = null,
    var drinkCategoryId2: Int? = null,
    var infoUrl: String? = null,
    var alcohol: Short? = null,
    var star: Float? = null
)