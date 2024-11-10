package functions

fun main() {
    val result = "Bayu" to "UP";
    println(result);

}


infix fun String.to(name: String): String {
    if (name == "UP") {
        return this.uppercase();
    } else {
        return this.lowercase();
    }
}