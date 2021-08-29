package com.tomshumi.atHomePartyBackend.bean.dto

import com.tomshumi.atHomePartyBackend.bean.entity.DrinkRecord

data class HomeDto(
    var pickupDrinkList: List<DrinkRecord>? = null,
    var beerRankingList: List<DrinkRecord>? = null,
    var chuhighRankingList: List<DrinkRecord>? = null,
    var sakeRankingList: List<DrinkRecord>? = null,
    var wineRankingList: List<DrinkRecord>? = null
) {
}