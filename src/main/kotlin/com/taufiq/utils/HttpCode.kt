package com.taufiq.utils

import io.ktor.http.*

object HttpCode {
    internal val NOT_FOUND = HttpStatusCode.NotFound
    internal val OK = HttpStatusCode.OK
    internal val BAD_REQUEST = HttpStatusCode.BadRequest
    internal val INTERNAL_ERROR = HttpStatusCode.InternalServerError
    internal val ACCEPTED = HttpStatusCode.Accepted
}