public class Baggage {

    private final double baggageWeight;
    private final BookingClass bookingClass;
    private BaggageTag baggageTag;

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

    public void setBaggageTag(BaggageTag baggageTag) {
        this.baggageTag = baggageTag;
    }

    public BaggageTag getBaggageTag() {
        return baggageTag;
    }

}

