import java.util.LinkedList;
import java.util.Queue;

public class Warteschlange {
    private CheckInDesk checkInDesk;
    private final Queue<Passenger> queue;

    public Warteschlange() {
        this.queue = new LinkedList<>();
    }

    public void addToQueue(Passenger passenger) {
        queue.add(passenger);
    }

    public Passenger removeFromQueue() {
        return queue.poll();
    }

    public Passenger getFirst(){
        return queue.peek();
    }
}
