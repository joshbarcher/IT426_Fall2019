package example;

import java.awt.*;

public class House
{
    private Color color;
    private int houseNumber;

    public House(Color color, int houseNumber)
    {
        this.color = color;
        this.houseNumber = houseNumber;

        System.out.println("House created");
    }

    public House(Color color)
    {
        this.color = color;

        System.out.println("House created");
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    }
}
