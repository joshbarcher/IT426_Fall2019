package car_builder_files;

public class Car
{
    private int numDoors;
    private int numCylinders;
    private String color;

    public Car(int numDoors, int numCylinders, String color)
    {
        this.numDoors = numDoors;
        this.numCylinders = numCylinders;
        this.color = color;
    }

    public int getNumDoors()
    {
        return numDoors;
    }

    public void setNumDoors(int numDoors)
    {
        this.numDoors = numDoors;
    }

    public int getNumCylinders()
    {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders)
    {
        this.numCylinders = numCylinders;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "A " + color + " car with " + numDoors +
                " doors and " + numCylinders + " cylinders";
    }
}
