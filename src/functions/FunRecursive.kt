package functions

fun main() {
    // Function Recursive adalah function yang memanggil dirinya sendiri
    // KELEMAHAN : jika digunakan terlalu dalam terjadi error
    // SOLUSI : menggunkan tail recursive

//    println(factorialLoop(10))
//    println(factorialRecursive(10))
//    displayData(10000);
    displayDataTrail(1000)
}

// contoh menggunakan recursive
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

// contoh recursive biasa akan error stackoverflow
fun displayData(value: Int) {
    println("Recursive Biasa $value");
    if (value > 0) {
        displayData(value - 1)
    }

}

// contoh trail recursive
tailrec fun displayDataTrail(value: Int) {
    println("Recursive Tail $value");
    if (value > 0) {
        displayDataTrail(value - 1)
    }
}


// contoh menggunakan loop
fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1) {
        result *= i;
    }
    return result;
}