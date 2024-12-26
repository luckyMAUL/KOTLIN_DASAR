
fun main(){
    val dataName:Array<String> = arrayOf("asep","ucup","agus","cecep")
    val dataNilai:Array<Int> = arrayOf(89,98,98,79)

    for( i in dataName.indices){
        println("your name : ${dataName[i]} and your mark: ${dataNilai[i]}")


    }
    for(name in dataName){
        println("nama anda : $name")
    }
    println(dataName.size)
    println(dataNilai.get(3))
    println(dataNilai.set(3,88))
    println(dataNilai.indexOf(9))
   

    for (nilai in dataNilai) {
        println(nilai)
    }
    dataName[2]="Yanti"



}