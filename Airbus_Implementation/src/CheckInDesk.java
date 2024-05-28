import java.util.Queue;

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


}
