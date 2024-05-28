import java.util.LinkedList;
import java.util.Queue;

public class Warteschlange {
    private CheckInDesk checkInDesk;
    private final Queue<Passenger> queue;

    public Warteschlange() {
        this.queue = new LinkedList<>();
    }

    public boolean addToQueue(Passenger passenger) {
        if (queue.size() < 30) {
            queue.offer(passenger);
            return true;
        } else {
            return false;
        }
    }

    public Passenger removerFromQueue() {
        return queue.poll();
    }
}
