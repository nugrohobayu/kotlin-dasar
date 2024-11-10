package looping

fun main() {
    // Pada do-while loop, blok kode di dalam do akan dijalankan setidaknya sekali sebelum kondisi pada while dievaluasi.

    var count = 6

    do {
        println("Perulangan ke-$count")
        count++
    } while (count < 5)

    println("Selesai!")
}
