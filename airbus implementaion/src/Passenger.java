import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Passenger extends Human{
    private List<Baggage> baggages;
    private String passportID;
    private Ticket ticket;
    private Reader reader;
    private boolean hasWarrant;


    public Passenger(String firstname, String lastname, String gender, LocalDate dateofbirth, String passportID,List<Baggage> baggages, String humanIris, String humanFingerprint, Warrent warrent){
        super(firstname, lastname, gender, dateofbirth, humanIris, humanFingerprint);
        this.passportID = passportID;
        this.baggages = baggages;
        this.hasWarrant = hasWarrant;
        this.baggages = new ArrayList<>();

    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return getFirstName();
    }

    public boolean authenticateRandomly() {
        Random random = new Random();
        int authType = random.nextInt(3);

        switch (authType) {
            case 0:
                return reader.scanPassport();
            case 1:
                return reader.scanIris();
            case 2:
                return reader.scanFingerprint();
            default:
                return false;
        }
    }

    public boolean hasWarrant() {
        return hasWarrant;
    }

    public List<Baggage> getBaggageList() {
        return baggages;
    }

    public void addBaggage(Baggage baggage) {
        baggages.add(baggage);
    }
}
