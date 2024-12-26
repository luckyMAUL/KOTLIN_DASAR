import java.util.Scanner

fun main() {
   var scanner = Scanner(System.`in`)

    print("masukan nilai anda :")
    val nilai: Int= scanner.nextInt()

    if(nilai  >= 90){
        println("sangat bagus")
    }else if(nilai >= 80){
        println("nilai bagus")
    }else if (nilai >= 70){
        println("cukup")
    }else{
        println("nilai remidi")
    }
}