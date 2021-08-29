package com.tomshumi.atHomePartyBackend.bean.entity

data class DrinkSnackRecord(
    var id: Int? = null,
    var drinkId: Int? = null,
    var snackId: Int? = null,
    var recommendation: Short? = null
)