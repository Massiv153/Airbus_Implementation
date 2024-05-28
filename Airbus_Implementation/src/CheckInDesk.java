import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckInDesk {
    private Warteschlange warteschlange;
    private Printer printer;
    private final ConveyorBelt conveyorBelt;
    private Wartebereich wartebereich;
    private Reader[] reader;
    private FederalPoliceOfficer federalPoliceOfficer;
    private FederalPolice federalPolice;
    private Container[] containers;
    private final RobotArm robotArm;



    public CheckInDesk(ContainerLagerLeer containerLagerLeer, BaggageLager baggageLager) {
        this.conveyorBelt = new ConveyorBelt();
        this.robotArm = new RobotArm(conveyorBelt, baggageLager, containerLagerLeer);
        this.warteschlange = new Warteschlange();
        this.printer = new Printer();
        this.reader = new Reader[3];
        this.federalPoliceOfficer = new FederalPoliceOfficer();


    }


    public void processPassenger(Passenger passenger) {

        if (passenger.authenticateRandomly()) {
            System.out.println("OO");
            switch (passenger.hasWarrant()){
                case Warrent.YES:
                    federalPoliceOfficer.arrestedPassengers(passenger);
                case Warrent.NO:
                    for (Baggage baggage : passenger.getBaggageList()) {
                        conveyorBelt.processBaggage(baggage, printer, robotArm);

                    }
                    printer.printBoardingPass(passenger);
            }
        }

    }

    public Warteschlange getWarteschlange() {
        return warteschlange;
    }


}
