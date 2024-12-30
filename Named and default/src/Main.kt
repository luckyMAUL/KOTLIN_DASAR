//=====Named Argument======
fun panggilNama(namafirst: String,middel: String,last: String): String{
    return "$namafirst $middel $last"
}

//=====Default Argument======
fun FullNameOLD(
    first: String = "hello",
    middle: String = " is ",
    last: String = "world"): String {
    return "$first $middle $last"
}


fun main() {
    //=====Named Argument======
    val fullName=panggilNama(last = "ali", middel = "nuggroho", namafirst = "ucup")
    println(fullName)

    //=====Default Argument======
    val full_Name = FullNameOLD()
    println(full_Name)

    val ubahName =FullNameOLD(first = "bambang")
    println(ubahName)


}