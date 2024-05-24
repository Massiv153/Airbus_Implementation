import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ConveyorBelt {
    private CheckInDesk checkInDesk;
    private Baggage baggage;

    public void processBaggage(Baggage baggage, Printer printer, AtomicInteger sequenceID) {
        baggage.getBaggageWeight();
        BaggageTag tag = new BaggageTag(sequenceID.incrementAndGet());
        printer.printBaggageTag(tag);

    }

    public Baggage getBaggage(){
        return baggage;
    }
    public void removeBaggage(){
        baggage = null;
    }

}
