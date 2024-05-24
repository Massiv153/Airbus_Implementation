public class Container {
    private final int breite = 5;
    private final int laenge = 3;
    private final int hoehe = 3;
    private final int maxCapacity = 45;
    private int remainingCapacity;
    private  int top;
    private final Baggage[] containerBaggage;

    public Container(Baggage[] containerBaggage) {
        this.containerBaggage = containerBaggage;
    }
    public boolean isFull(){
        return top == maxCapacity - 1;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public void storeBaggage(Baggage baggage){
        if (!isFull()){
            containerBaggage[++top] = baggage;
            remainingCapacity--;
        } else if (isEmpty()) {
            System.out.println("Next container");
        }
    }
    public int getRemainingCapacity(){
        return remainingCapacity;
    }

    public Baggage[] getContainerBaggage() {
        return containerBaggage;
    }

    public double getContainerWeight(){
        return calcContainerWeight();

    }

    private double calcContainerWeight(){
        double sum = 0;
        for (Baggage baggage : containerBaggage){
            sum += baggage.getBaggageWeight();
        }
        return sum;

    }

}
