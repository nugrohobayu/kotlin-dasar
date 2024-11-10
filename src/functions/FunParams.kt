package functions

fun main() {

    sayHello("Dian", "Bayu");
    sayHai("Bayu");
}

fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName");
}

// Function default parameters
fun sayHai(firstName: String, lastName: String = "") {
    println("Hai $firstName $lastName");
}
