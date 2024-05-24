import java.time.LocalTime;

public class Ticket {


    private String uuid;
    private String bookingID;
    private String flight;
    private String from;
    private String to;
    private LocalTime departure;
    private LocalTime arrival;
    private String bookingClass;
    private String seat;

    public Ticket(String uuid, String bookingID, String flight, String from, String to,
                  LocalTime departure, LocalTime arrival, String bookingClass, String seat){
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
