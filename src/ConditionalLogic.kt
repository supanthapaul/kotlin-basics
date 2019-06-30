fun main(args: Array<String>) {
    // when ( switch for kotlin )
    val x = 5

    when(x) {
        1 -> println("Too low")
        2,3 -> println("low")
        in 4..8 -> println("Perfect")
        else -> println("Number too high or zero")
    }
}