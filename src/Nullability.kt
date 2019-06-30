fun main(args: Array<String>) {

    // NON-NULLABLE variable
    var name : String = "JohnyB"
    // cannot set it to null
//  name = null

    // NULLABLE variable ( ? after type )
    var nullableName : String? = "Do I even exist?"
    // can be set to null
//  nullableName = null

    // Have to do null check before accessing nullable variable properties ( so that it's not null when we access it )
    // Method 1
    var length: Int
    if(nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    // Method 2 - Safe call operator ( ? after variable name )
    // returns value if it exists or returns null
    println(nullableName?.length)

    // Method 3 - Elvis operator ( ?: )
    // returns value if there is or returns whatever we provide after the ?:
    length = nullableName?.length ?: -1
    println(length)

    // !!
    // use it when we know FOR SURE that the value isn't null
    // it will throw a Null Pointer Exception if value is null and app will crash
    println(nullableName!!.length)
}