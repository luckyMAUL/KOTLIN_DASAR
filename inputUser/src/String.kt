import java.util.Scanner

fun main(){
    var namaDepan:String="agus"
    var namTengah:String="setian"
    var namaBelakang:String="abdi"

    val namalengkap:String="$namaDepan $namTengah $namaBelakang"
    println("$namalengkap")

    namTengah="kosong" //ubah isi variabel

    var panjang:String ="${namalengkap.length}"
    println(panjang)

  



}