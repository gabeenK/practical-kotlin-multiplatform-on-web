package todoapp.ui.welcome

import csstype.*
import emotion.react.css
import kotlinx.html.InputType
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.section
import react.useState

// 외부 인터페이스
external interface WelcomePageProps : Props {
    var name: String?
}

val WelcomePage = FC<WelcomePageProps> {
    val (name, setName) = useState(it.name?: "SpringRunner")

    section {
        css {
            position = Position.absolute
            top = 30.pct
            transform = translate(0.px, (-50).pct)
        }
        div {
            css {
                paddingBottom = 8.px
                fontSize = 20.px
                fontWeight = FontWeight.bold
            }
            +"Hello, $name"
        }

        ReactHTML.input {
            type = react.dom.html.InputType.text
            value = name
            onChange = { event ->
                setName(event.currentTarget.value)
            }

        }
    }
}
