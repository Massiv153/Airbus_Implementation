public class BoardingPass {
    private final String seat;
    private final Passenger passenger;

    public BoardingPass(String seat, Passenger passenger) {
        this.seat = seat;
        this.passenger = passenger;
    }

    public String getSeat() {
        return seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
