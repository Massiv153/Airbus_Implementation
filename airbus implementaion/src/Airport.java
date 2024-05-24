public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
    private Baggage[] allBaggage;

    private Warteschlange[] queue;
    private final Container[] containers;

    public Airport() {
        buildCheckInDesk();

        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
        containers = new Container[8];
        Lager lager = new Lager();
        checkInDesk = new CheckInDesk[10];

        queue = new Warteschlange[10];
        for (int i = 0; i < 10; i++)
            queue[i] = new Warteschlange();

    }


    private void buildCheckInDesk() {
        for (int i = 0; i < 10; i++) {
            new CheckInDesk(containers);
        }
    }

    public Baggage[] getAllBaggage(){
        return allBaggage;
    }
}