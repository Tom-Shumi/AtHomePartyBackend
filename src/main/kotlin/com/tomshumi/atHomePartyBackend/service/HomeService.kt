package com.tomshumi.atHomePartyBackend.service

import com.tomshumi.atHomePartyBackend.Constants.Companion.CATEGORY_ID_BEER
import com.tomshumi.atHomePartyBackend.Constants.Companion.CATEGORY_ID_CHUHIGH
import com.tomshumi.atHomePartyBackend.Constants.Companion.CATEGORY_ID_SAKE
import com.tomshumi.atHomePartyBackend.Constants.Companion.CATEGORY_ID_WINE
import com.tomshumi.atHomePartyBackend.Constants.Companion.RANK_DISP_NUM
import com.tomshumi.atHomePartyBackend.bean.dto.HomeDto
import com.tomshumi.atHomePartyBackend.mapper.DrinkMapper
import com.tomshumi.atHomePartyBackend.mapper.PickupDrinkMapper
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class HomeService(
    private val pickupDrinkMapper: PickupDrinkMapper,
    private val drinkMapper: DrinkMapper
) {

    fun home(): HomeDto {
        val homeDto = HomeDto()

        // ピックアップの取得
        homeDto.pickupDrinkList = pickupDrinkMapper.find()

        // 各種ランキングの取得
        homeDto.beerRankingList = drinkMapper.findRanking(CATEGORY_ID_BEER, RANK_DISP_NUM)
        homeDto.chuhighRankingList = drinkMapper.findRanking(CATEGORY_ID_CHUHIGH, RANK_DISP_NUM)
        homeDto.sakeRankingList = drinkMapper.findRanking(CATEGORY_ID_SAKE, RANK_DISP_NUM)
        homeDto.wineRankingList = drinkMapper.findRanking(CATEGORY_ID_WINE, RANK_DISP_NUM)

        return homeDto
    }
}