public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
<<<<<<< HEAD
    private Baggage[] allBaggage;
=======
    private Warteschlange[] queue;
<<<<<<< HEAD
    private final Container[] containers;

    public Airport() {
        buildCheckInDesk();

        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
        containers = new Container[8];
=======
>>>>>>> e409e45e8f95eb0208607c690ce98d551bcfec80

    public Airport(int numQueue) {
        buildCheckInDesk(10);
<<<<<<< HEAD
        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
=======
>>>>>>> 8069c4e651a6c5dbc81114adb084ac39c0455bbf
        Lager lager = new Lager();
        checkInDesk = new CheckInDesk[10];

        queue = new Warteschlange[10];
        for (int i = 0; i < 10; i++)
            queue[i] = new Warteschlange();
>>>>>>> e409e45e8f95eb0208607c690ce98d551bcfec80
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