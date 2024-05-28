import java.util.ArrayList;

public class Cabin {
    private CabinType cabinType;
    private int startRow;
    private int endRow;
    private String[] letters;
    private int seatsOverall;
    private ArrayList<Seat> seats;

    public Cabin(CabinType cabinType, int startRow, int endRow, String[] seats, int seatsOverall){
        this.seats = new ArrayList<Seat>();
        this.cabinType = cabinType;
        this.startRow = startRow;
        this.endRow = endRow;
        this.letters = seats;
        this.seatsOverall = seatsOverall;

        for (int i = startRow; i < endRow; i++) {
            for (String c: seats){
                this.seats.add(new Seat(i,c));
            }
        }
    }

    public String toString(){
        return this.cabinType+" "+this.createString()+" "+this.seats.toString()+" : "+this.seatsOverall;
    }

    public int getSeatsOverall() {
        return seatsOverall;
    }

    private String createString(){
        String s = "";
        for (int i = startRow; i <= endRow; i++) {
            s = s+i+",";
            if(i == i){
                s=s+i;
            }
        }
        return s;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
}
