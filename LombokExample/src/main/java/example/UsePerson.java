package example;

public class UsePerson
{
    public static void main(String[] args)
    {
        Person p = new Person.PersonBuilder()
                .address("1000 apple lane.")
                .fName("Bob")
                .lName("Smith")
                .age(10)
                .nickname("Smiley")
                .build();

    }
}
