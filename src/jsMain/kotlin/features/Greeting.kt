package features

/**
 * it seems that the best way to do types in kotlin/js is to define classes and methods
 * using @file:jsModule & @file:jsNonModule prevents the project from building
 * this is because the index.js file doesn't exist during compile time, and is only copied once the app starts running.
 *
 *
 * in other words, I must find a way to either copy js project files during compile time
 * or write simple boilerplate code that must be well-tested.
 */
class Greeting {

    private val jsGreetingModule = utils.require("./index")
    fun greet(message: String) {
        jsGreetingModule.greeting(message)
    }
}