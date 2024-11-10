package functions

fun main() {
    // Higher Order Function adalah function dengan parameter function, bisa menjadikan lambda function sebagai parameter

    fun hello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name);
        return "Hello $nameTransform";
    }

    println(hello("Bayu") { value: String -> value.uppercase() });

}

