import java.util.Comparator;

public class Container{
    private final int breite = 5;
    private final int laenge = 3;
    private final int hoehe = 3;
    private final int maxCapacity = breite*laenge*hoehe;
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
    public int getRemainingCapacity(){
        int usedCapacity = top + 1;
        return maxCapacity - usedCapacity;
    }

    public void push(Baggage baggage){
        if (!isFull()){
            containerBaggage[++top] = baggage;
        } else {
            throw new IllegalStateException("Container ist Voll");
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
