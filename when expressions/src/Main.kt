//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val nilai = 7

    when(nilai){
        7 -> "nilai cukup"
        8 ->"nilai cukup bagus"
        9 ->"nilai bagus"
        10 ->"sabgat bagus"
        else -> "tidak masuk kkm"
    }
    println(nilai)

    //###Jika kita memiliki dua atau lebih
    // baris kode yang akan kita jalankan

    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    //when juga memungkinkan kita untuk memeriksa
    // instance dengan tipe

    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
    val value2 =  27
    val ranges = 10..50

//memeriksa nilai yang terdapat pada sebuah
// Range atau Collection

    when(value2){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
}

