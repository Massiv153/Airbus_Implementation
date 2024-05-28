import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConveyorBelt {
    private CheckInDesk checkInDesk;
    private Baggage baggage;
    private List<Integer> sequenceIDList;
    private int sequenceID = 1;

    public void processBaggage(Baggage baggage, Printer printer, RobotArm robotArm) {
        double weight = baggage.getBaggageWeight();
        BaggageTag tag = new BaggageTag(sequenceID);
        sequenceIDList.add(sequenceID);
        baggage.setBaggageTag(tag);
        printer.printBaggageTag(tag);
        checkInDesk.getWarteschlange().getFirst().getTicket().setSequenceIDList(sequenceIDList);

        moveForward();
        robotArm.addBaggagetoLager();
        moveBackward();

        generateNewSeqID();


    }

    public Baggage getBaggage(){
        return baggage;
    }
    public void removeBaggage(){
        baggage = null;
    }

    private void generateNewSeqID(){
         sequenceID++;
    }

    public List<Integer> getSequenceIDList(){
        return sequenceIDList;
    }

    private void moveForward(){

    }

    private void moveBackward(){

    }
}
