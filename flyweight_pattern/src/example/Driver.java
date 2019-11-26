package example;

import java.awt.*;
import java.util.Random;

public class Driver
{
    private static Color[] houseColor = {
        Color.ORANGE, Color.RED, Color.YELLOW, Color.BLUE,
        Color.PINK, Color.CYAN, Color.BLACK, Color.GRAY
    };


    public static void main(String[] args)
    {
        long totalMemoryUsedStart = Runtime.getRuntime().totalMemory() -
                                    Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 1000000; i++)
        {
            //House house = new House(getRandomColor(), i);

            //flyweight example
            House house = HouseFactory.getHouse(getRandomColor());
            house.setHouseNumber(i);
        }

        long totalMemoryUsedEnd = Runtime.getRuntime().totalMemory() -
                Runtime.getRuntime().freeMemory();

        System.out.println("Memory used " + (totalMemoryUsedEnd - totalMemoryUsedStart)
                                / 1000000.0 + " mb");
    }

    public static Color getRandomColor()
    {
        int randomNumber = new Random().nextInt(houseColor.length);
        return houseColor[randomNumber];
    }
}
