package address_builder_files;

public class AddressEnvelope
{
    public static void main(String[] args)
    {
        AddressBuilder builder = new AddressBuilder();

        builder.setHomeNumber("1000")
            .setStreetName("Plum St.")
            .setCity("Seattle")
            .setState("WA")
            .setZip(99999);

        Address address = builder.createAddress();
        System.out.println(address);

    }
}
