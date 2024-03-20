
package testwedding;
import java.time.*;
public class Person
{
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    //add get and set functions
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String name)
    {
        firstName = name;
    }
    public String getLastName()
    {
       return  lastName;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public LocalDate getBirthDate()
    {
        return birthDate;
    }
    
    //add constructor method
    public Person(String first, String last, LocalDate bDate)
    {
        firstName = first;
        lastName = last;
        birthDate = bDate;
    }
}
