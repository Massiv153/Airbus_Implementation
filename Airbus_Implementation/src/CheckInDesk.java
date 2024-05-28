import java.util.concurrent.atomic.AtomicInteger;

public class CheckInDesk {
    private Warteschlange warteschlange;
    private Printer printer;
    private final ConveyorBelt conveyorBelt;
    private Wartebereich wartebereich;
    private Reader[] reader;
    private FederalPoliceOfficer federalPoliceOfficer;
    private Container[] containers;
    private ContainerLagerLeer containerLagerLeer;
    private final RobotArm robotArm;

    public CheckInDesk(ContainerLagerLeer containerLagerLeer) {
        this.containerLagerLeer = containerLagerLeer;
        this.conveyorBelt = new ConveyorBelt();
        BaggageLager baggageLager = new BaggageLager();
        this.robotArm = new RobotArm(conveyorBelt, baggageLager, containerLagerLeer);
        Warteschlange warteschlange = new Warteschlange();
        Printer printer = new Printer();


        Wartebereich wartebereich = new Wartebereich();
        Reader[] reader = new Reader[3];
        FederalPoliceOfficer federalPoliceOfficer = new FederalPoliceOfficer();

    }


    public void processPassenger(Passenger passenger, FederalPoliceOfficer officer, AtomicInteger sequenceID) {
        if (passenger.authenticateRandomly()) {
            switch (passenger.hasWarrant()){
                case Warrent.YES:
                    officer.arrestedPassengers(passenger);
                case Warrent.NO:
                    for (Baggage baggage : passenger.getBaggageList()) {
                        conveyorBelt.processBaggage(baggage, printer, sequenceID, robotArm);
                    }
                    printer.printBoardingPass(passenger);
            }
        }
    }

}
