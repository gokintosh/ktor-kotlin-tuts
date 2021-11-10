package com.gokulnair.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.contactUsModule(){
    routing {
        get("/contactUs"){
            call.respond("Contact us on the below number")
        }

        get("/aboutUs"){
            call.respond("About us")
        }
    }
}