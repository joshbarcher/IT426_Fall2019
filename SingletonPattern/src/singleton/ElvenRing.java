package singleton;

import java.util.HashMap;
import java.util.Map;

public class ElvenRing
{
    //fields
    private boolean isWorn;
    private String jewelColor;

    //instances map
    private static Map<RingName, ElvenRing> instances;

    private ElvenRing(boolean isWorn, String jewelColor)
    {
        this.isWorn = isWorn;
        this.jewelColor = jewelColor;
    }

    public static ElvenRing getInstance(RingName name)
    {
        //lazy init
        if (instances == null)
        {
            instances = new HashMap<>();

            instances.put(RingName.NARYA, new ElvenRing(
                    false, "red"));
            instances.put(RingName.NENYA, new ElvenRing(
                    false, "white"));
            instances.put(RingName.VILYA, new ElvenRing(
                    false, "blue"));
        }

        return instances.get(name);
    }

    public void putOnRing()
    {
        if (this.isWorn)
        {
            System.out.println("The " + this.jewelColor +
                    " ring is already being worn!");
        }
        else
        {
            this.isWorn = true;
            System.out.println("You put on the " + this.jewelColor +
                    " ring and feel more powerful!");
        }
    }

    public enum RingName
    {
        NARYA,
        NENYA,
        VILYA
    }
}
