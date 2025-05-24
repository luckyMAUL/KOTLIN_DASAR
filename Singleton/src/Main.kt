object DatabaseManager {
    var name = "ucup"

    fun connect() {
        println("Terhubung ke database: $name")
    }
    fun update(namenew: String){
        name = namenew
    }
}

fun main() {
    // ini instance
    DatabaseManager.connect() // Terhubung ke database: MainDB
    DatabaseManager.update("udun") // menfubah nilai
    DatabaseManager.connect()
}
/*Singleton dalam Kotlin adalah sebuah pola desain yang
memastikan bahwa hanya ada satu instance (contoh) dari
suatu kelas yang dapat dibuat dan menyediakan akses global ke
instance tersebut
 */