//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val text  = "Dicoding"
    val firstChar = text[3]

    // dihitung dari indek 0 jadi huruf D = 0 ,i = 1 c = 2, o =3

    println("huruf ke 4 dari kalimat $text huruf ke 4: $firstChar ")

    for (char in text){
        print("$char ")
    }

    //======Escaped String============
    /*
    \t: menambah tab ke dalam teks.
    \n: membuat baris baru di dalam teks.
    \’: menambah karakter single quote kedalam teks.
    \”: menambah karakter double quote kedalam teks.
    \\: menambah karakter backslash kedalam teks.
     */
    val statement = "Kotlin is \"Awesome!\""
    println("\\ hello word \\")

    //====Raw String=======
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}