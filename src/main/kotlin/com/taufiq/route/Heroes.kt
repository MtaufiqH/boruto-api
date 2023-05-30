package com.taufiq.route

import com.taufiq.models.HeroResponse
import com.taufiq.repo.HeroRepository
import com.taufiq.utils.ValueExt.orNol
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.heroes() {
    val heroRepository: HeroRepository by inject()
    route("/boruto/heroes") {

        get {
            try {
                val page = call.request.queryParameters["page"]?.toInt().orNol()
                require(page in 1..5)
                val heroResponse = heroRepository.getAllHeroes(page)
                call.respond(message = heroResponse, status = HttpStatusCode.OK)
            } catch (exception: NumberFormatException) {
                call.respond(
                    message = HeroResponse(
                        message = "Only Numbers allowed!",
                        status = false,
                        response = HttpStatusCode.BadRequest.toString()
                    ),
                    status = HttpStatusCode.BadRequest
                )
            } catch (e: IllegalArgumentException) {
                call.respond(
                    message = HeroResponse(
                        message = "Heroes Not found!",
                        status = false,
                        response = HttpStatusCode.NotFound.toString()
                    ),
                    status = HttpStatusCode.NotFound
                )
            }
        }

        get("/search") {
            try {
                val name = call.request.queryParameters["name"].orEmpty()
                val foundedHero = heroRepository.searchHero(name)
                call.respond(message = foundedHero, status = HttpStatusCode.OK)
            } catch (e: IllegalArgumentException) {
                call.respond(
                    message = HeroResponse(
                        message = e.localizedMessage,
                        status = false,
                        response = HttpStatusCode.NotFound.toString()
                    ), status = HttpStatusCode.NotFound
                )
            }
        }
    }
}