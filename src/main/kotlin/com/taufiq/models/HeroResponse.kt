package com.taufiq.models

import kotlinx.serialization.Serializable

@Serializable
data class HeroResponse(
    val status: Boolean? = false,
    val response: String,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val data: List<Hero> = emptyList(),
)
