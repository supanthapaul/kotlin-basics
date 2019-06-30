fun main(args: Array<String>) {

    // function with argument
    fun greet(name: String) {
        println("Hello $name!")
    }
    greet("Luke")

    // function with return type
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    println(add(23, 54))

    // function with argument default value
    fun printMood(mood: String = "Happy") {
        println("I'm feeling $mood")
    }
    printMood()
}