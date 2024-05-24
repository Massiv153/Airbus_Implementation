import java.time.LocalDate;
import java.util.List;

public class Passenger extends Human{
    private List<Baggage> baggages;
    private String passportID;
    private Baggage baggage;

    public Passenger(String firstname, String lastname, String gender, LocalDate dateofbirth, String passportID,List<Baggage> baggages){
        super(firstname, lastname, gender, dateofbirth);
        this.passportID = passportID;
        this.baggages = baggages;

    }

}
