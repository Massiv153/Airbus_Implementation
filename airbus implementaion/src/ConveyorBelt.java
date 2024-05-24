import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ConveyorBelt {
    private CheckInDesk checkInDesk;

    public void processBaggage(Baggage baggage, Printer printer, AtomicInteger sequenceID) {
        baggage.getBaggageWeight(baggage);
        BaggageTag tag = new BaggageTag(sequenceID.incrementAndGet());
        printer.printBaggageTag(tag);

    }

    public void get
}
