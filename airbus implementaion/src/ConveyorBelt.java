import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ConveyorBelt {
    private CheckInDesk checkInDesk;

    public void processBaggage(Baggage baggage, Printer printer, AtomicInteger sequenceID) {
        baggage.setBaggageWeight(new Random().nextDouble() * 30);
        BaggageTag tag = new BaggageTag(sequenceID.incrementAndGet());
        printer.
    }
}
