package conditional_expretion

fun main() {
    val nilai = 80;

    //bentuk dasar
    when (nilai) {
        90 -> println("Excellent")
        80 -> println("Good")
        70 -> println("Not Bad")
        else -> println("Bad") // Default statement
    }

    // bentuk lebih simple
    val result = when (nilai) {
        90 -> "Sangat Baik"
        80 -> "Baik"
        70 -> "Cukup"
        else -> "Tidak Luus"
    }
    println(result)


    var peringkat = "A";

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C");
    when (peringkat) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Selamat Anda Lulus")
    }

}