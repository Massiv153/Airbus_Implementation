public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
<<<<<<< HEAD
    private Baggage[] allBaggage;
=======
    private Warteschlange[] queue;
>>>>>>> e409e45e8f95eb0208607c690ce98d551bcfec80

    public Airport(int numQueue) {
        buildCheckInDesk(10);
<<<<<<< HEAD
        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
=======
        Lager lager = new Lager();

        queue = new Warteschlange[numQueue];
        for (int i = 0; i < numQueue; i++)
            queue[i] = new Warteschlange();
>>>>>>> e409e45e8f95eb0208607c690ce98d551bcfec80
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