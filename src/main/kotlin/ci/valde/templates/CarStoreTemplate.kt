package ci.valde.templates
import io.ktor.html.*
import kotlinx.html.*
import kotlinx.html.div

class CarStoreTemplate : Template<HTML> {
    val carOnSale = Placeholder<FlowContent>()
    val carRecommended = Placeholder<FlowContent>()

    override fun HTML.apply() {
        head {
            title { +"Car store app" }
        }
        body {
            h1 { +"Welcome to my car store" }
        }
        div {
            h1 { +"On sale" }
            h2 { insert(carOnSale) }
        }
        div {
            h1 { +"Recommend" }
            h2 { insert(carRecommended) }
        }
    }


}