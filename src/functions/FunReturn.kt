package functions

fun main() {
    var total = sum(1, 2);
    total = sumShort(3, 4)
    println(total)


}

// return biasa
fun sum(a: Int, b: Int): Int {
    return a + b;
}

// return dengan short expretion
fun sumShort(x: Int, y: Int): Int = x + y;