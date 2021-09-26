package com.tomshumi.atHomePartyBackend.bean.response

import com.tomshumi.atHomePartyBackend.bean.dto.BeerInfoDto

class BeerListResponse(
    var beerList: List<BeerInfoDto>? = null
): PaginationResponse() {

}