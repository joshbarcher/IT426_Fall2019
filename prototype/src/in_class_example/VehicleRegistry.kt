package in_class_example

class VehicleRegistry
{
    private val prototypes: MutableMap<String, Vehicle> = mutableMapOf()

    fun addPrototype(makeModel: String, vehicle: Vehicle) {
        prototypes[makeModel] = vehicle
    }

    fun getPrototype(makeModel: String): Vehicle
    {
        val prototype = prototypes[makeModel]

        //creating a copy of the prototype object
        return Vehicle(prototype!!)
    }
}