enum class Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

enum class Direction(val degrees: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    fun isVertical() = this == NORTH || this == SOUTH
}

fun main(){
    val dir = Direction.SOUTH
    println(dir.degrees)       // Output: 180
    println(dir.isVertical())  // Output: true
}