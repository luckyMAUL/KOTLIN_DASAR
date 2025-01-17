
sealed class Result {
    data class Success(val data: Int) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}
fun main(){
    val result: Result = Result.Error("Oops!")
    when (result) {
        //jika salah satu kondisi dihapus, kode akan error
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }

}
