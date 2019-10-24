package address_builder_files;

public class Address
{
    private String homeNumber;
    private String streetName;
    private String city;
    private String state;
    private int zip;

    public Address(String homeNumber, String streetName, String city, String state, int zip)
    {
        this.homeNumber = homeNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getHomeNumber()
    {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber)
    {
        this.homeNumber = homeNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getZip()
    {
        return zip;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    @Override
    public String toString()
    {
        return homeNumber + " " + streetName + " " +
                city + ", " + state + " " + zip;
    }
}
