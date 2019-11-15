package in_class_example

class Vehicle(private var make: String = "",
              private var model: String = "",
              private var mpg: Int = 0,
              private var miles: Int = 0,
              private var color: String = "")
{
    //copy constructor to create a copy of the car
    constructor(other: Vehicle): this()
    {
        make = other.make
        model = other.model
        mpg = other.mpg
        miles = other.miles
        color = other.color
    }

    fun setMiles(miles: Int)
    {
        this.miles = miles
    }

    fun setColor(color: String)
    {
        this.color = color
    }

    override fun toString(): String
    {
        return "Vehicle(make='$make', model='$model', " +
                "mpg=$mpg, miles=$miles, color='$color')"
    }
}