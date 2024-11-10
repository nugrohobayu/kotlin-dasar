package operation

fun main() {
    // Operasi Boolean
    // &&       akan true jika semua true
    // ||       akan true jika salah satu saja true
    // !        negasi atau kebalikan

    val nilaiUjian = 90;
    val absensi = 50;
    val isLulusUjian = nilaiUjian > 90;
    val isLulusAbsensi = absensi > 90;

    val isLulus: Boolean = isLulusUjian && isLulusAbsensi;
    println(isLulus)
}