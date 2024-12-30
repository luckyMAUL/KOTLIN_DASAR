//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   /*
   range tipe data yang merepresentasikan
   sekumpulan nilai yang terurut
    */

    val rangeInt =1..10
    for (i in rangeInt){
        println(i)
    }
    val range = 'a'..'f'
    for (ch in range) {
        println(ch) // Output: a, b, c, d, e, f
    }
    // step untuk meloncati angka
    // rangTo sama seperti menggunak 1..10
    val range_Int = 1 .rangeTo(10) step 2
    range_Int.forEach {
        print("$it ")
    }
    println(range_Int.step)


//======dowTo untuk urutan kebalik
    val downInt_To = 10.downTo(1)
    downInt_To.forEach {
        print("$it")
    }

    // fungsi in memeriksa apakah suatu nilai ada pada nilai cakupan Range.
    // Sebaliknya, kita juga bisa memeriksa apakah suatu nilai tidak
    // ada pada nilai cakupan Range tersebut. Kita bisa
    // menggunakan kata kunci !in

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

}

