package com.taufiq.utils


object PageUtils{
    fun calculatePage(currentPage: Int): Map<String, Int?> {
        val prevPage = if (currentPage == 1) null else currentPage - 1
        val nextPage = if (currentPage == 5) null else currentPage + 1

        return mapOf(PREV_PAGE to prevPage, NEXT_PAGE to nextPage)
    }

    const val PREV_PAGE = "prevPage"
    const val NEXT_PAGE = "nextPage"
}

