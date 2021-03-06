package ci.valde

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ci.valde.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}
