public class Baggage {
    private Priority priority;
    private double baggageWeight;
    private BaggageTag baggageTag;

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }



    public Baggage(double baggageWeight, Priority priority){
        this.baggageWeight = baggageWeight;
        this.priority = priority;

    }

    @Override
    public String toString() {
        return "Baggage{" + "weight =" + baggageWeight + ", tag =" + baggageTag + '}';
    }
}

