package com.tbxark

import spark.kotlin.*

class Application {
    companion object {
        val port: Int?
            get() {
                return System.getenv("PORT")?.toInt()
            }
    }
}

fun main(args: Array<String>) {
    port(Application.port ?: 5000)
    get("/") { "Success" }
}

