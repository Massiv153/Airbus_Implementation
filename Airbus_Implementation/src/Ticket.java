import java.time.LocalTime;
import java.util.List;

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
    private List<Integer> sequenceIDList;

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

    public void setSequenceIDList(List<Integer> sequenceIDList) {
        this.sequenceIDList = sequenceIDList;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }
}
