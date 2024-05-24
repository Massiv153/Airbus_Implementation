import java.util.ArrayList;
import java.util.List;

public class FederalPoliceOfficer {
    private List<Passenger> arrestedPassengers;
    private List<Baggage> confiscatedBaggage;

    public FederalPoliceOfficer() {
        this.arrestedPassengers = new ArrayList<>();
        this.confiscatedBaggage = new ArrayList<>();
    }

    public void arrestedPassengers(Passenger passenger) {
        System.out.println("Passenger " + passenger.getFirstName() + passenger.getLastName() + " arrested.");
        arrestedPassengers.add(passenger);
        confiscatedBaggage.addAll(passenger.getBaggageList());
        System.out.println("Baggage confiscated: " + passenger.getBaggageList());
    }

    public List<Passenger> getArrestedPassengers() {
        return arrestedPassengers;
    }

    public List<Baggage> getConfiscatedBaggage() {
        return confiscatedBaggage;
    }
}
