import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckInDesk {
    private Warteschlange warteschlange;
    private Printer printer;
    private ConveyorBelt conveyorBelt;
    private BaggageLager lager;
    private Wartebereich wartebereich;
    private Reader[] reader;
    private FederalPoliceOfficer federalPoliceOfficer;

    public CheckInDesk() {
        Warteschlange warteschlange = new Warteschlange();
        Printer printer = new Printer();
        ConveyorBelt conveyorBelt = new ConveyorBelt();
        BaggageLager lager = new BaggageLager();
        Wartebereich wartebereich = new Wartebereich();
        Reader[] reader = new Reader[3];
        FederalPoliceOfficer federalPoliceOfficer = new FederalPoliceOfficer();
    }


    public void processPassenger(Passenger passenger, FederalPoliceOfficer officer, AtomicInteger sequenceID) {
        if (passenger.authenticateRandomly()) {
            if (passenger.hasWarrant()) {
                officer.arrestedPassengers(passenger);
            } else {
                for (Baggage baggage : passenger.getBaggageList()) {
                    conveyorBelt.processBaggage(baggage, printer, sequenceID);
                }
                printer.printBoardingPass(passenger);
            }
        }
    }

}
