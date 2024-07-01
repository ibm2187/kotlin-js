package utils


class Startup {

    private val fs = require("fs")

    fun copyProjectFiles(errorCallback: (String?) -> Unit) {
        fs.copyFile(
            "/Users/ibm2187/Desktop/kotlin-js/kotlin-js-test/index.js",
            "/Users/ibm2187/Desktop/kotlin-js/kotlin-js-test/build/js/packages/ibmTest/kotlin/index.js"
        ) { error ->
            errorCallback(error?.message as? String)
        }
    }

}