package variable

// constant variable adalah val (immutable) yang bisa di akses untuk global
const val NAME_CONSTANT = "Bayu";

fun main() {
    // Ada dua jenis variable, yaitu mutable (bisa diubah) & imutable (tdk bisa diubah)
    // 1. Mutable (var) variablenya/data bisa diubah-ubah
    // 2. Immutable (val) variablenya/data tidak bisa diubah-ubah
    /// Direkomendasikan menggunakan Immutable agar tipedatanya tidak bisa diubah

    var firstName = "Dian"; // mutable
    val lastName = "Bayu"; // immutable
    println("$firstName $lastName");

    // nullable variable
    var name: String? = null;
    name ="Bayu"
    println(name);
    println(name.length);


    println(NAME_CONSTANT);
}

