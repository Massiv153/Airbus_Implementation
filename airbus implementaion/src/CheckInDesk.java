import java.util.Queue;

public class CheckInDesk {
    private Warteschlange warteschlange;
    private Printer printer;
    private ConveyorBelt conveyorBelt;
    private BaggageLager lager;
    private Wartebereich wartebereich;
    private Reader[] reader;
    private FederalPoliceOfficer federalPoliceOfficer;
    private Container[] containers;

    public CheckInDesk(Container[] containers) {
        this.containers = containers;
        Warteschlange warteschlange = new Warteschlange();
        Printer printer = new Printer();
        ConveyorBelt conveyorBelt = new ConveyorBelt();
        BaggageLager baggageLager = new BaggageLager();
        Wartebereich wartebereich = new Wartebereich();
        Reader[] reader = new Reader[3];
        FederalPoliceOfficer federalPoliceOfficer = new FederalPoliceOfficer();
        RobotArm robotArm = new RobotArm(conveyorBelt, baggageLager, containers );
    }


}
