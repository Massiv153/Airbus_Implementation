public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private Lager lager;
    private Wartebereich wartebereich;

    public Airport() {
        buildCheckInDesk(10);
        Lager lager = new Lager();
    }


    private void buildCheckInDesk(int anzahlCheckIn) {
        for (int i = 0; i < anzahlCheckIn; i++) {
            new CheckInDesk();
        }
    }
}