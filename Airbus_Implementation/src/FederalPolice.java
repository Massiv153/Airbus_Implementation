import java.util.ArrayList;
import java.util.List;

    public class FederalPolice {
        private List<Passenger> prisoners;

        public FederalPolice() {
            this.prisoners = new ArrayList<>();
        }

        public void arrestPassenger(Passenger passenger) {
            prisoners.add(passenger);
            System.out.println("Passenger " + passenger.getFirstName() + passenger.getLastName() + " has been arrested and taken to prison.");
        }

        public List<Passenger> getPrisoners() {
            return prisoners;
        }
    }

