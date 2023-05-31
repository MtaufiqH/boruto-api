package com.taufiq.route

import com.taufiq.utils.HttpCode.OK
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(message = "Welcome to Boruto API Server", status = OK)
    }
}