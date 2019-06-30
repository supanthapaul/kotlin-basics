fun main(args: Array<String>) {

    // lambda expression
    val printMessage = {message: String -> println(message)}
    printMessage("Hello World!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(21, 42))

    // type declared first
    val sumB : (Int , Int) -> Int = {x , y -> x + y}
    println(sumB(5, 3))

    // lambda passed as an argument of function
    // the type Unit means void
    fun downloadData(url: String, completion: () -> Unit) {
        // send a download req
        // we got back data
        // there were no errors
        // call completion lambda
        completion()
    }
    downloadData("google.com", {
        // the completion lambda
        println("The code here will only run after completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // *did all the processing*
        val car = Car("Tesla", "ModelX", "Red")
        // call completion lambda with argument
        completion(car)
    }
    // if the last argument of a function is a lambda then we can
    // put the {} outside the function brackets (just looks cleaner)
    downloadCarData("google.com") {car ->
        // The car variable is accessible here
        println("It is a ${car.color} ${car.make} ${car.model}")
    }
    // if there is only one argument in the lambda
    // we can just use 'it' instead of naming the variable
    downloadCarData("google.com") {
        println("It is a ${it.color} ${it.make} ${it.model}")
    }

    // another example (nullable argument)
    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // *did processing*
        val webRequestSuccess = false
        if(webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }
    downloadTruckData("google.com") {truck, success ->
        if(success) {
            println("The ${truck?.make} ${truck?.model} has a towing capacity of ${truck?.towingCapacity}")
        } else {
            println("Something went wrong")
        }
    }
}