package cars;

public class Car
{
    //similar per car type
    private String make;
    private String model;
    private int mpg;

    //different per car type
    private int miles;
    private String color;

    //copy constructor to create a copy of the car
    public Car(Car other)
    {
        //copying across all fields
        make = other.make;
        model = other.model;
        mpg = other.mpg;
        miles = other.miles;
        color = other.color;
    }

    public Car(String make, String model, int mpg, int miles, String color)
    {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.miles = miles;
        this.color = color;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getMpg()
    {
        return mpg;
    }

    public int getMiles()
    {
        return miles;
    }

    public String getColor()
    {
        return color;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setMpg(int mpg)
    {
        this.mpg = mpg;
    }

    public void setMiles(int miles)
    {
        this.miles = miles;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mpg=" + mpg +
                ", miles=" + miles +
                ", color='" + color + '\'' +
                '}';
    }
}
