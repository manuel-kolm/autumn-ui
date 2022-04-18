import components.Message
import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    kotlinext.js.require("./app.css")

    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }

    val message = Message.create {
        name = "Manuel"
        text = "Hello, World!"
    }

    render(welcome, container)
    render(message, container)
}