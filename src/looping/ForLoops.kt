package looping

fun main() {


    val names = arrayOf("Dian", "Bayu", "Nugroho")
    // Looping dengan array
    for (i in names) {
        println(i)
    }

    val height = 5;
    //looping dengan menggunakan range
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    for (i in 0..10 step 2) {
        println("Bilangan Genap : $i");
    }

}