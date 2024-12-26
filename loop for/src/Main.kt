//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val loopFor = 1..5
    for (i in loopFor){
        println("value is $i!")
    }
    //mengakses indek dengan withIndex()
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
    val ranges1 = 1.rangeTo(10) step 3
    ranges1.forEach { value ->
        println("value is $value!")
    }
}

