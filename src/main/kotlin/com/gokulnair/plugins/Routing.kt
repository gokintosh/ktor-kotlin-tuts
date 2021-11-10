package com.gokulnair.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/goku") {
            call.respondText("Hello gokul!")
        }
        get("/roku"){
            call.respond("hello Roku")
        }
    }
}
