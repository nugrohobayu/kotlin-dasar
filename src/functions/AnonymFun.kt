package functions

fun main() {
    // Anonymous Function adalah function tanpa nama

    fun hello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name);
        return "Hello $nameTransform";
    }

    val upper = fun(name: String): String {
        return if (name == "") {
            "UPS"
        } else {
            name.uppercase()
        }
    }

    println(hello("Bayu", upper))
}

