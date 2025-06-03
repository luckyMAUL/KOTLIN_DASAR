

enum class Status {
    SUCCESS,
    FAILURE,
    PENDING
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val status = Status.SUCCESS
    when (status) {
        Status.SUCCESS -> println("Operation was successful")
        Status.FAILURE -> println("Operation failed")
        Status.PENDING -> println("Operation is pending")
    }
    // Output: Operation was successful

}