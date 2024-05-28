import java.time.LocalTime;

public class Ticket {


    private final String uuid;
    private final String bookingID;
    private final String flight;
    private final String from;
    private final String to;
    private final LocalTime departure;
    private final LocalTime arrival;
    private final BookingClass bookingClass;
    private final String seat;

    public Ticket(String uuid, String bookingID, String flight, String from, String to,
                  LocalTime departure, LocalTime arrival, BookingClass bookingClass, String seat){

        this.uuid = uuid;
        this.bookingID = bookingID;
        this.flight = flight;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.arrival = arrival;
        this.bookingClass = bookingClass;
        this.seat = seat;
    }

    public String getUuid() {
        return uuid;
    }
}
