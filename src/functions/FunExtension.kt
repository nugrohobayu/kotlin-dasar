package functions

fun main() {
    // Extension Function adalah kemampuan menambahkan function pada tipe data yang sudah ada
    // Harap bijak menggunakanannya karena sangat powerfull dan jika terlalu banyak digunakan akan membingungkan
    val name: String = "Bayu";
    val hello: String = name.hello();
    println(hello);
}

fun String.hello(): String {
    return "Hello $this";
}

