public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
    private Baggage[] allBaggage;

    public Airport() {
        buildCheckInDesk(10);
        ContainerLagerLeer containerLager = new ContainerLagerLeer();
        CSVReader csvReader = new CSVReader();
        allBaggage =  csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
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