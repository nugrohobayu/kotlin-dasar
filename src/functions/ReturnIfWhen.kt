package functions

fun main() {
    // Fungction scope adalah ruang lingkup function bisa di akses
    println(helloWorld(""));
    println(helloWhen("Bayu"))
}

// Return IF
fun helloWorld(name: String = ""): String {
    return if (name == "") {
        "Hello Bro";
    } else {
        "Hello $name";
    }
}

// Return WHEN
fun helloWhen(name: String = ""): String {
    return when (name) {
        "" -> "Hello Bro When";
        else -> "Hello $name"
    }
}


