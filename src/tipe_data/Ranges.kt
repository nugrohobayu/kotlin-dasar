package tipe_data

fun main() {
    val range = 1..10

    println(range.count()) // mendapatkan total data di range
    println(range.contains(3)) // mengecek apakah sebuah value terdapat di range
    println(range.first) // mengecek range pertama
    println(range.last) // mengecek range terakhir
}