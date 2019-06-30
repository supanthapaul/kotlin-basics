//class Car(make: String, model: String, color: String) {
//    val make = make
//    val model = model
//    var color = color
//
//    fun accelerate() {
//        println("Vroom vroom")
//    }
//
//    fun details() {
//        println("It is a $color $make $model")
//    }
//}
//
//// more concise way of declaring properties ( in the constructor )
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

// the parent class which needs to be inherited from needs to be 'open'
open class Vehicle(val make:String, val model: String) {

    // making a function open allows us to override it in child classes
    open fun accelerate() {
        println("Vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

// class inherited from vehicle
class Car(make: String, model: String, var color: String) : Vehicle(make, model) {

    // overriding function of parent class
    override fun accelerate() {
        println("we are going super fast!")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("Taking the horses to the rodeo")
    }
}

fun main(args: Array<String>) {
//    val car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    truck.details()

    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()
}
