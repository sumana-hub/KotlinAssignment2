fun main() {
    // Creating an instance of Car
    val car = Car("White", "Subaru", "Outback", 4)
    println(car)
    car.accelerate()    // Calling accelerate method
    car.parallelPark()  // Calling parallelPark method specific to Car
    car.stop()          // Calling stop method

    // Creating an instance of Bus
    val bus = Bus("White", "Mercedes-Benz", "Citaro", 30)
    println(bus)
    bus.accelerate()    // Calling accelerate method
    bus.openRearDoor()  // Calling openRearDoor method specific to Bus
    bus.stop()          // Calling stop method
}

// Base class representing a generic Vehicle
open class Vehicle(
    val color: String,   // Color of the vehicle
    val make: String,    // Manufacturer of the vehicle
    val model: String    // Model of the vehicle
) {
    // Method to simulate vehicle acceleration
    open fun accelerate() {
        println("$make $model is accelerating.")
    }

    // Method to simulate vehicle stopping
    open fun stop() {
        println("$make $model has stopped.")
    }

    // Overriding toString method to provide custom string representation of the object
    override fun toString(): String {
        return "Vehicle(color='$color', make='$make', model='$model')"
    }
}

// Class representing a Car, which is a type of Vehicle
class Car(
    color: String,
    make: String,
    model: String,
    val numberOfDoors: Int   // Number of doors in the car
) : Vehicle(color, make, model) {
    // Overriding accelerate method to provide custom implementation for Car
    override fun accelerate() {
        println("$make $model with $numberOfDoors doors is accelerating.")
    }

    // Overriding stop method to provide custom implementation for Car
    override fun stop() {
        println("$make $model with $numberOfDoors doors has stopped.")
    }

    // Method specific to Car for parallel parking
    fun parallelPark() {
        println("$make $model is parallel parking.")
    }

    // Overriding toString method to include number of doors in the string representation
    override fun toString(): String {
        return "Car(color='$color', make='$make', model='$model', numberOfDoors=$numberOfDoors)"
    }
}

// Class representing a Bus, which is a type of Vehicle
class Bus(
    color: String,
    make: String,
    model: String,
    val passengerCapacity: Int  // Maximum number of passengers the bus can carry
) : Vehicle(color, make, model) {
    // Overriding accelerate method to provide custom implementation for Bus
    override fun accelerate() {
        println("$make $model with capacity $passengerCapacity is accelerating.")
    }

    // Overriding stop method to provide custom implementation for Bus
    override fun stop() {
        println("$make $model with capacity $passengerCapacity has stopped.")
    }

    // Method specific to Bus for opening the rear door
    fun openRearDoor() {
        println("$make $model's rear door is opening.")
    }

    // Overriding toString method to include passenger capacity in the string representation
    override fun toString(): String {
        return "Bus(color='$color', make='$make', model='$model', passengerCapacity=$passengerCapacity)"
    }
}
