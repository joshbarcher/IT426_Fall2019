package singleton;

public class SingletonDriver
{
    public static void main(String[] args)
    {
        //singleton tests
        //get our first instance
        DeathStar deathStar = DeathStar.getInstance();
        System.out.println(deathStar);

        DeathStar deathStar2 = DeathStar.getInstance();
        System.out.println(deathStar2);

        deathStar.armSuperLaser();
        deathStar.fireSuperLaser("Alderaan");

        System.out.println("*******************************");

        ElvenRing narya = ElvenRing.getInstance(ElvenRing.RingName.NARYA);
        narya.putOnRing();
        narya.putOnRing();

        ElvenRing vilya = ElvenRing.getInstance(ElvenRing.RingName.VILYA);
        vilya.putOnRing();

        System.out.println(narya);
        System.out.println(vilya);
    }
}
