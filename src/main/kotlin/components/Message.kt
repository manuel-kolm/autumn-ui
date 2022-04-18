package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.useState

external interface MessageProps : Props {
    var name: String
    var text: String
    var createDateTime: String
    var imageMediaId: String
}

val Message = FC<MessageProps> { props ->
    var name by useState(props.name)
    var text by useState(props.text)
    div {
        className = "grid grid-cols-2"
        div {

        }
        div {
            p {
                + name
            }
            p {
                + text
            }
        }
    }
}