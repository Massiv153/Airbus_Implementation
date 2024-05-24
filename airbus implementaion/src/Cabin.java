public class Cabin {
    private CabinType cabinType;
    private int startRow;
    private int endRow;
    private char[] seats;
    private int seatsOverall;

    public Cabin(CabinType cabinType, int startRow, int endRow, char[] seats, int seatsOverall){
        this.cabinType = cabinType;
        this.startRow = startRow;
        this.endRow = endRow;
        this.seats = seats;
        this.seatsOverall = seatsOverall;
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
}
