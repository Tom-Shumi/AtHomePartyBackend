package com.tomshumi.atHomePartyBackend.bean.entity

data class SakeDetailRecord(
    var id: Int? = null,
    var drinkId: Int? = null,
    var prefectureId: Short? = null,
    var flavor: Short? = null,
    var riceType: Short? = null,
    var sakeDegree: Short? = null,
    var acidity: Short? = null
)