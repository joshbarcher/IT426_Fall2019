package car_builder_files;

public class CarBuilder
{
    private int numDoors;
    private int numCylinder;
    private String color;

    public CarBuilder setNumDoors(int numDoors)
    {
        this.numDoors = numDoors;
        return this;
    }

    public CarBuilder setNumCylinder(int numCylinder)
    {
        this.numCylinder = numCylinder;
        return this;
    }

    public CarBuilder setColor(String color)
    {
        this.color = color;
        return this;
    }

    public Car createCar()
    {
        return new Car(numDoors, numCylinder, color);
    }
}
