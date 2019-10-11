package singleton;

public class DeathStar
{
    //fields
    private int numTroopers;
    private boolean commander;
    private boolean isSuperLaserArmed;

    //singleton object
    private static DeathStar instance;

    private DeathStar(int numTroopers, boolean commander,
                      boolean isSuperLaserArmed)
    {
        this.numTroopers = numTroopers;
        this.commander = commander;
        this.isSuperLaserArmed = isSuperLaserArmed;
    }

    public static DeathStar getInstance()
    {
        //lazy initialization
        if (instance == null)
        {
            //instantiate the first time
            instance = new DeathStar(100,
                    true, false);
        }
        return instance;
    }

    public void armSuperLaser()
    {
        if (isSuperLaserArmed)
        {
            System.out.println("Super Laser already armed!");
        }
        else
        {
            this.isSuperLaserArmed = true;
            System.out.println("Super Laswer has been armed!");
        }
    }

    public void fireSuperLaser(String target)
    {
        if (isSuperLaserArmed)
        {
            this.isSuperLaserArmed = false;
            System.out.println(target + " exploded!");
        }
        else
        {
            System.out.println("Super laser is not armed!");
        }
    }
}
