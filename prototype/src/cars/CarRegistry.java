package cars;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry
{
    private Map<String, Car> prototypes = new HashMap<>();

    public void addPrototype(String makeModel, Car car)
    {
        prototypes.put(makeModel, car);
    }

    public Car getCar(String makeModel)
    {
        Car prototype = prototypes.get(makeModel);
        return new Car(prototype);
    }
}
