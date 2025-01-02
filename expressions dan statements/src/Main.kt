
fun sum(value1: Int, value2: Int) = value1 + value2
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val now =1
    val openOffice =5

    //======STATEMENT========
    // statement karena ia tidak mengembalikan nilai apapun,

    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

    //=====EXPRESSION========
    //statement yang dapat mengembalikan nilai dan bisa
    // kita simpan ke dalam sebuah variabe

    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)//EXPERESSION


    sum(1 , 1 * 4)

}