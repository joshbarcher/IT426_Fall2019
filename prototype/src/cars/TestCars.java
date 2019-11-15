package cars;

public class TestCars
{
    public static void main(String[] args)
    {
        Car prototype = new Car("Toyota", "Tacoma", 20,  0, "");
        CarRegistry registry = new CarRegistry();
        registry.addPrototype("Toyota Tacoma", prototype);

        Car tt1 = registry.getCar("Toyota Tacoma");
        Car tt2 = registry.getCar("Toyota Tacoma");
        Car tt3 = registry.getCar("Toyota Tacoma");

        tt1.setColor("Red");
        tt2.setColor("Green");
        tt3.setColor("Blue");

        System.out.println(tt1);
        System.out.println(tt2);
        System.out.println(tt3);
    }
}
