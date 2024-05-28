public class Wartebereich {
    private boolean isTaken;
    private Passenger passenger;

    public boolean isTaken(){
        return isTaken;
    }

    public void setTaken(boolean isTaken){
        this.isTaken = isTaken;
    }



    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
