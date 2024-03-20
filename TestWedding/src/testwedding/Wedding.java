
package testwedding;
import java.time.*;
public class Wedding 
{
    //ADD fields to describe wedding obj
    private Couple couple;
    private LocalDate weddingDate;
    private String location;
    //add constr for wedding ; parameteized
    public Wedding(Couple c, LocalDate date, String place)
    {
        couple = c;
        weddingDate = date;
        location = place;
    }
    //add get methods for 3 fields
    public Couple getCouple()
    {
        return couple; 
    }
    public LocalDate getWeddingDate()
    {
        return weddingDate;
    }
    public String getLocation()
    {
        return location;
    }
}
