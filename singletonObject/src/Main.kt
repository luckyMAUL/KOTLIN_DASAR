object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}
fun main(){
    CentralLibrary.borrowBookById(21)
}

