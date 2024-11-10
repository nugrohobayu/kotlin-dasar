package functions

fun main() {
    fullName(lastName = "Nugroho", firstName = "Dian", middleName = "Bayu")

}

fun fullName(firstName: String, lastName: String, middleName: String) {
    println("$firstName $middleName $lastName");

}