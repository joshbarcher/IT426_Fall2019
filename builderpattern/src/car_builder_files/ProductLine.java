package car_builder_files;

public class ProductLine
{
    public static void main(String[] args)
    {
        CarBuilder builder = new CarBuilder();
        builder.setColor("red")
               .setNumCylinder(6)
               .setNumDoors(2);

        Car car = builder.createCar();
        System.out.println(car);
    }
}
