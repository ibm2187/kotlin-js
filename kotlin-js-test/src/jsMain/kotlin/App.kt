external fun require(module: String): dynamic

fun main(args: Array<String>) {

    val fs = require("fs")

    val file = fs.copyFile(
        "/Users/ibm2187/Desktop/kotlin-js/kotlin-js-test/index.js",
        "/Users/ibm2187/Desktop/kotlin-js/kotlin-js-test/build/js/packages/ibmTest/kotlin/index.js"
    ) { error ->
        if (error == null) {
            val index = require("./index")
            index.greeting("ibm")
        } else {
            console.error(error)
        }
    }

}