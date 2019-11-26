package example;

import java.util.HashMap;
import java.awt.*;
import java.util.Map;

public class HouseFactory
{
    private static Map<Color, House> savedHouses = new HashMap<>();

    public static House getHouse(Color color)
    {
        House house = savedHouses.get(color);

        if (house == null)
        {
            house = new House(color);
            savedHouses.put(color, house);
        }

        return house;
    }
}
