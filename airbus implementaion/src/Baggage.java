public class Baggage {
<<<<<<< HEAD
    private final double baggageWeight;
    private Priority priority;
=======
    private double baggageWeight;

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

>>>>>>> e409e45e8f95eb0208607c690ce98d551bcfec80

    public Baggage(double baggageWeight, Priority priority){
        this.baggageWeight = baggageWeight;
        this.priority = priority;

    }
}

