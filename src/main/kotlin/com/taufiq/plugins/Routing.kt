package com.taufiq.plugins

import com.taufiq.route.heroes
import com.taufiq.route.root
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        heroes()

        staticResources("boruto/images","images")
    }
}