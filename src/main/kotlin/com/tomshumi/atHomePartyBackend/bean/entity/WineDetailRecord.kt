package com.tomshumi.atHomePartyBackend.bean.entity

data class WineDetailRecord(
    var id: Int? = null,
    var drinkId: Int? = null,
    var countryId: Int? = null,
    var bodyType: Short? = null,
    var flavor: Short? = null
)