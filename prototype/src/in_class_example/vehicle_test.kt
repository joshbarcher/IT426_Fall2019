package in_class_example

fun main()
{
    //create a registry
    val registry = VehicleRegistry()

    //create some prototypes
    val truckPrototype = Vehicle(
        make = "Toyota",
        model = "Tacoma",
        mpg = 20,
        miles = 0,
        color = ""
    )
    val carPrototype = Vehicle(
        make = "Dodge",
        model = "Caliber",
        mpg = 32,
        miles = 0,
        color = ""
    )

    //register prototypes
    registry.addPrototype("Toyota Tacoma", truckPrototype)
    registry.addPrototype("Dodge Caliber", carPrototype)

    //create a vehicle with copy constructor
    val firstVehicle = registry.getPrototype("Toyota Tacoma")
    firstVehicle.setMiles(60000)
    firstVehicle.setColor("Brown")
    println("First vehicle: $firstVehicle")

    val secondVehicle = registry.getPrototype("Dodge Caliber")
    secondVehicle.setMiles(166342)
    secondVehicle.setColor("Brown")
    println("First vehicle: $secondVehicle")

    val ttPrototype = registry.getPrototype("Toyota Tacoma")
    val cPrototype = registry.getPrototype("Dodge Caliber")
    println("TT prototype - $ttPrototype")
    println("Car prototype - $cPrototype")
}