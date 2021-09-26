package com.tomshumi.atHomePartyBackend.bean.response

import com.tomshumi.atHomePartyBackend.Constants

open class PaginationResponse(
    var maxPage: Int? = null // maxPage:0が1ページ目
) {

    fun setMaxPage(size: Int) {
        if (size == 0) {
            maxPage = 0
            return
        }

        maxPage = (size - 1) / Constants.PAGE_SIZE
    }
}