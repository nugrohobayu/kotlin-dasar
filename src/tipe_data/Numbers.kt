package tipe_data

fun main() {
    //bilangan bulat
    var age: Byte = 29;
    var ageInt: Int = 200;

    //floating number / bilangan koma
    var valueFloat: Float = 29.50F;
    var valueDouble: Double = 29.50;

    //literals
    var hexadecimalLiteral: Int = 0xFF;
    var binaryLiteral: Int = 0b000010101010;

    //underscore in number
    var num: Int = 1_000;

    // conversion number
    var number: Int = 100;
    var numberFloat: Float = number.toFloat();
    var numberDouble: Double = number.toDouble();
    println(numberDouble);
}