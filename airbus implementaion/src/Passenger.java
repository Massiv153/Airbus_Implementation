import java.time.LocalDate;
import java.util.List;

public class Passenger extends Human{
    private List<Baggage> baggages;
    private String passportID;
    private Ticket ticket;

    public Passenger(String firstname, String lastname, String gender, LocalDate dateofbirth, String passportID,List<Baggage> baggages, String humanIris, String humanFingerprint, Warrent warrent){
        super(firstname, lastname, gender, dateofbirth, humanIris, humanFingerprint);
        this.passportID = passportID;
        this.baggages = baggages;

    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
