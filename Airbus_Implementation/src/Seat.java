public class Seat {
    private int row;
    private String letter;
    private Passenger passenger;

    public Seat (int row, String letter){
        this.row = row;
        this.letter = letter;
        this.passenger = null;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
