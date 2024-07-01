import features.Greeting
import utils.Startup

fun main(args: Array<String>) {

    val startup = Startup()

    startup.copyProjectFiles {

        if (it == null) {
            launchApp()
        }

    }


}

private fun launchApp() {
    val greeting = Greeting()
    greeting.greet("ibm testing kotlin/js")
}