package tipe_data

fun main() {
    var name: String = "Bayu";
    var address: String = """
       Jalan Muararajeun Baru 1 No. 11
       Cibenying Kaler
       Bandung
    """.trimIndent()
    println(address)

    // menggabungkan String
    var firstName: String = "Dian";
    var lastName: String = "Bayu";
    var fullName: String = "$firstName $lastName ${lastName.length}";
    println(fullName)
}