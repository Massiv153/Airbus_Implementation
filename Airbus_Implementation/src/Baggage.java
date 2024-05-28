public class Baggage {

    private final double baggageWeight;
    private final BookingClass bookingClass;

    public Baggage(double baggageWeight, BookingClass bookingClass){
        this.baggageWeight = baggageWeight;
        this.bookingClass = bookingClass;
    }

    public BookingClass getPriority() {
        return bookingClass;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

}

