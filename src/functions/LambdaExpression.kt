package functions

fun main() {
    // Lambda Expression artinya function yang tidak memiliki nama
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        "$firstName $lastName"
    }
    println(lambdaName("Dian", "Bayu"));

    //jika parameters hanya satu bisa menggunakan keyword it
    val sayHelloLambda: (String) -> String = {
        "Hello $it"
    }
    println(sayHelloLambda("Bayu"));

}


