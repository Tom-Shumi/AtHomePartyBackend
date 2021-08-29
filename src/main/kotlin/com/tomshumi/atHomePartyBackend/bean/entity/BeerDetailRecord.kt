package com.tomshumi.atHomePartyBackend.bean.entity

data class BeerDetailRecord(
    var id: Int? = null,
    var drinkId: Int? = null,
    var bitter: Short? = null,
    var flavor: Short? = null,
    var hop: Short? = null,
    var sharp: Short? = null,
    var body: Short? = null
)