package functions

fun main() {
    // varargs adalah parameters terakhir yang bisa menampung banyak data mirip array tapi BEDA!!
    finalValue(title = "Jumlah Varargs =", 1, 2, 3, 4, 5);

    // arguments dengan Array
    val values = arrayOf(1, 2, 3, 4, 5)
    finalValueSum(title = "Jumlah array = ", values)

}

fun finalValue(title: String, vararg values: Int) {
    var total = 0.0;

    for (value in values) {
        total += value;
    }
    println("$title $total")
}

fun finalValueSum(title: String, values: Array<Int>) {
    var total = 0.0;

    for (value in values) {
        total += value;
    }
    println("$title $total")
}