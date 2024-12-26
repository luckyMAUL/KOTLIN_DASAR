import java.util.Scanner
import java.io.BufferedReader
import java.io.InputStreamReader

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var data:Int? = null

    //========redln=========
   println("input untuk tipe data String =")
   val inputUser= readln()
    println(inputUser)

    //======readLine==========
    println("input untuk tipe data angka =")
    val Nilai= readLine()?.toInt()
    val hitung =(Nilai ?: 0)+5
    println(hitung)

    //=====Scanner============
    val scanner = Scanner(System.`in`)
    println("masukan nilai =")
    data =scanner.nextInt()

    //Menggunakan BufferedReader
    val reader = BufferedReader(InputStreamReader(System.`in`))
    println("Masukkan teks:")
    val text = reader.readLine()
    println("Anda memasukkan: $text")

    


}