public class BoardingPass {

    private final int seat;
    private final String letter;
    private final Passenger passenger;

    public BoardingPass(String seat, Passenger passenger) {
        this.seat = Integer.parseInt(seat.split("")[0]);
        this.letter = seat.split("")[1];
        this.passenger = passenger;
    }

    public int getSeat() {
        return seat;
    }

    public String getLetter() {
        return letter;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
