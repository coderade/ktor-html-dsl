package ci.valde.plugins

import ci.valde.templates.CarStoreTemplate
import io.ktor.application.*
import io.ktor.html.*
import io.ktor.response.*
import io.ktor.routing.*


fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/html-template") {
            call.respondHtmlTemplate(CarStoreTemplate()) {
                carOnSale {
                    +"Ferrari F8"
                }
                carRecommended {
                    +"Aventador SVJ"
                }
            }
        }

        get("/html-dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li {
                                +"Item $n"
                            }
                        }
                    }
                }
            }
        }
    }
}
