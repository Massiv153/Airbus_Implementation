public class Baggage {

    private final double baggageWeight;
    private Priority priority;

    public Baggage(double baggageWeight, Priority priority){
        this.baggageWeight = baggageWeight;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

}

