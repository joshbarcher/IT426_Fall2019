package address_builder_files;

public class AddressBuilder
{
    private String homeNumber;
    private String streetName;
    private String city;
    private String state;
    private int zip;

    public AddressBuilder setHomeNumber(String homeNumber)
    {
        this.homeNumber = homeNumber;
        return this;
    }

    public AddressBuilder setStreetName(String streetName)
    {
        this.streetName = streetName;
        return this;
    }

    public AddressBuilder setCity(String city)
    {
        this.city = city;
        return this;
    }

    public AddressBuilder setState(String state)
    {
        this.state = state;
        return this;
    }

    public AddressBuilder setZip(int zip)
    {
        this.zip = zip;
        return this;
    }

    public Address createAddress()
    {
        return new Address(homeNumber, streetName, city, state, zip);
    }
}