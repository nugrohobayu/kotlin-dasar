package functions

fun main() {
    // Label digunakan untuk penanda dan bisa dipakai untuk BREAK, CONTINUE DAN RETURN
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}");
            if (j == 5) {
                break@loopI;
            }
        }
    }
}