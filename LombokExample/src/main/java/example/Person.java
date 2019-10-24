package example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person
{
    private String fName;
    private String lName;
    private int age;
    private String nickname;
    private String address;
}
