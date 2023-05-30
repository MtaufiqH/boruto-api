package com.taufiq.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

fun Application.configureDefaultHeaders() {
    install(DefaultHeaders) {
        val oneYearInSecond = Duration.ofDays(365).seconds
        header(HttpHeaders.CacheControl, "public, max_age=$oneYearInSecond, immutable")
    }
}