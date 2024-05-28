public class Container {
    private final int breite = 5;
    private final int laenge = 3;
    private final int hoehe = 3;
    private final int maxCapacity = 45;
    private  int top;
    private final Baggage[] containerBaggage;

    public Container() {
        this.containerBaggage = new Baggage[maxCapacity];
        top = -1;
    }
    public boolean isFull(){
        return top == maxCapacity - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(Baggage baggage){
        if (!isFull()){
            containerBaggage[++top] = baggage;
        } else if (isEmpty()) {
            System.out.println("Next container");
        }
    }
     public Baggage pop(){
        if (isEmpty()){
            return null;
        }
        Baggage removedBaggage = containerBaggage[top];
        containerBaggage[top--] = null;
        return  removedBaggage;
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
