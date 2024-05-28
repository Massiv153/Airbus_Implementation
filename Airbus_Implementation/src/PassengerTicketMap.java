import java.util.HashMap;

public class PassengerTicketMap {
    private final HashMap<Passenger, Ticket> passengerTicketHashMap;


    public PassengerTicketMap(){
        passengerTicketHashMap = new HashMap<>();

    }

    public void add(Passenger passenger, Ticket ticket) {
        passengerTicketHashMap.put(passenger, ticket);
    }

    public Ticket getTicket(Passenger passenger) {
        return passengerTicketHashMap.get(passenger);
    }
}

