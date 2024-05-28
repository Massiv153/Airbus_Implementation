public class Airport {
    private Passenger passenger;
    private final CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
    private Baggage[] allBaggage;
    private ContainerLagerLeer containerLager;

    private Warteschlange[] queue;


    public Airport() {
        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
        checkInDesk = new CheckInDesk[10];
        buildCheckInDesk();

        queue = new Warteschlange[10];
        for (int i = 0; i < 10; i++)
            queue[i] = new Warteschlange();

    }


    private void buildCheckInDesk() {
        for (int i = 0; i < 10; i++) {
            checkInDesk[i] = new CheckInDesk(containerLager);
        }
    }

    public Baggage[] getAllBaggage(){
        return allBaggage;
    }
}