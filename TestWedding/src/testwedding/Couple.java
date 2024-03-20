package testwedding;
import java.time.*;
public class Couple 
{
    //add fields to define couple
    private Person bride;
    private Person groom;
    //add get
    public Person getBride()
    {
        return bride;
    }
    public Person getGroom()
    {
        return groom;
    }
    public Couple(Person bride, Person groom)
    {
        this.bride = bride;
        this.groom = groom;
    }
}
