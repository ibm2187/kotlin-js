package utils

/**
 * We have to be careful about file movements or directory changes as they can break project initialization
 * todo look for a better way to copy js project files
 */
class Startup {

    private val fs = require("fs")

    fun copyProjectFiles(errorCallback: (String?) -> Unit) {
        fs.copyFile(
            "/Users/ibm2187/Desktop/kotlin-js/index.js",
            "/Users/ibm2187/Desktop/kotlin-js/build/js/packages/ibmTest/kotlin/index.js"
        ) { error ->
            errorCallback(error?.message as? String)
        }
    }

}