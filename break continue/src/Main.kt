//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    // fungsi continue ika hasil evaluasi expression yang diberikan bernilai
    // true, maka proses iterasi akan dilewatkan dan lanjut ke
    // proses iterasi berikutnya.

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

    //Penggunaan break pada kode di atas akan langsung
    // menghentikan proses iterasi jika variabel i bernilai
    // null.

    val listOfInt1= listOf(1, 2, 3, null, 5, null, 7)

    for (j in listOfInt1) {
        if (j == null) break
        print(j)
    }
    //=======Break dan Continue Labels============
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}