public class Airport {
    private Passenger passenger;
    private CheckInDesk[] checkInDesk;
    private Lager lager;
    private Wartebereich wartebereich;
    private Warteschlange[] queue;

    public Airport(int numQueue) {
        buildCheckInDesk(10);
        Lager lager = new Lager();

        queue = new Warteschlange[numQueue];
        for (int i = 0; i < numQueue; i++)
            queue[i] = new Warteschlange();
    }


    private void buildCheckInDesk(int anzahlCheckIn) {
        for (int i = 0; i < anzahlCheckIn; i++) {
            new CheckInDesk();
        }
    }
}