package tipe_data

fun main() {
    val numbers: Array<Int> = arrayOf(1,2,3,4,5);
    // size => mendapatkan panjang isi array
//    println(numbers.size)
    // get(index) => mendapatkan data posisi index array
//    println(numbers.get(1));
//    println(numbers[1]);
    // set(index,value) => mengubah data posisi index array
    numbers.set(1, 8);
    numbers[2] = 8;
//    println(numbers[2])

    // array null
    val members: Array<String?> = arrayOfNulls(3);
    members[0] ="Bayu";
    members[1] ="Bayu";
    members[2] ="Bayu";
//    members[3] ="Bayu"; ini akan error karena sudah ditentukan sizenya hanya 3
    println(members[2])
}