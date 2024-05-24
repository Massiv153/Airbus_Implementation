import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesks;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;

    private Baggage[] allBaggage;

    private Warteschlange[] queue;
    private List<Passenger> waitingArea;


    public Airport(int numQueue) {
        buildCheckInDesk(10);

        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);

        Lager lager = new Lager();
        waitingArea = new ArrayList<>();

        queue = new Warteschlange[numQueue];
        for (int i = 0; i < numQueue; i++)
            queue[i] = new Warteschlange();


    }



    private void buildCheckInDesk(int anzahlCheckIn) {
        for (int i = 0; i < anzahlCheckIn; i++) {
            new CheckInDesk();
        }
    }

    public Baggage[] getAllBaggage(){
        return allBaggage;
    }

}
