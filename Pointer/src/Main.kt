

class Kotak(var warna: String)

fun ubahWarna(k: Kotak, warnaBaru: String) {
    k.warna = warnaBaru
}

fun main() {
    val kotak = Kotak("Biru")
    println("Sebelum: ${kotak.warna}")

    ubahWarna(kotak, "Merah")
    println("Sesudah: ${kotak.warna}")
}
