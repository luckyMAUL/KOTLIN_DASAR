

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
fun nameDrive(vararg name: String): String{
    return name.joinToString("")
}
//=====Multiple vararg-parameters=====
//====dua tipe data ,yang satu vararg dan satunya tipe data biasa
//====vararg di sarankan pada posisi tipe data terakhir
fun sets(nameSet: String, vararg number: Int): Int {
    return number.sum()
}
//=====ketika vararg di taruh di posisi depan
fun sets1(vararg number: Int, name: String): Int {
    return number.sum()
}
//========
fun main() {
    /* kunci vararg, kita juga bisa menyederhanakan beberapa
     parameter yang memiliki tipe data yang sama menjadi
     parameter tunggal.*/

    val number =sumNumbers(1,2,3,4,3)
    val name=nameDrive("asep ","ucup ","bambang "," agus")
    //=====input Multiple vararg-parameters=====
    sets("Kotlin", 10, 10)
    sets1(10, 10, name = "Kotlin")

    println(number)
    println(name)



}
