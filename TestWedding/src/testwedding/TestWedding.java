
package testwedding;
import java.time.*;
public class TestWedding 
{
    public static void main(String[] args)
    {
        // create LocalDate for bride and groom birthdates
        LocalDate date1 = LocalDate.of(2000, 12, 14);//br1 bdate
        LocalDate date2 = LocalDate.of(2000, 6, 20);//gr1 bdate
        LocalDate date3 = LocalDate.of(2000, 5, 4);//br2 bdate
        LocalDate date4 = LocalDate.of(2000, 2, 3);//gr2 bdate
        LocalDate date5 = LocalDate.of(2023, 7, 19);//wed1 date
        LocalDate date6 = LocalDate.of(2023, 8, 14);//wed2 date
        //add 4 person obj using bdates created and adding names(2 br 2 gr)
        Person bride1 = new Person("Simran" , "Shah", date1);
        Person groom1 = new Person("Raj" , "Patel", date2);
        Person bride2 = new Person("Kinjal" , "Patel", date3);
        Person groom2 = new Person("Jay" , "Patel", date4);
        //createe 2 couples
        Couple couple1 = new Couple(bride1, groom1);
        Couple couple2= new Couple(bride2, groom2);
        //instantiate 2 wed obj using dates 5 and 6
        Wedding wedding1 = new Wedding (couple1, date5, "Community Hall");
        Wedding wedding2 = new Wedding (couple2, date6, "SeaGrape");
        displayWeddingDetails(wedding1);
        displayWeddingDetails(wedding2);
    }
    public static void displayWeddingDetails(Wedding w)
    {
        Couple couple = w.getCouple();
        LocalDate weddingDate = w.getWeddingDate();
        String location = w.getLocation();
        Person bride = couple.getBride();
        Person groom = couple.getGroom();
        String firstBride = bride.getFirstName();
        String lastBride = bride.getLastName();
        LocalDate brideBDate = bride.getBirthDate();
        String  firstGroom = groom.getFirstName();
        String lastGroom = groom.getLastName();
        LocalDate groomBDate = groom.getBirthDate();
        System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
        System.out.println("Date: " + weddingDate + " Location: " + location);
        System.out.println("Bride: " + firstBride + " " + lastBride + " " + brideBDate);
        System.out.println("Groom: " + firstGroom + " " + lastGroom + " " + groomBDate);
    }
}
