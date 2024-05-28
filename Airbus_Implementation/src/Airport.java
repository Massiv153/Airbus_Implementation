import java.util.List;
import java.util.Random;

public class Airport {

    private Passenger passenger;
    private final CheckInDesk[] checkInDesk;
    private BaggageLager baggageLager;
    private Wartebereich wartebereich;
    private Baggage[] allBaggage;
    private ContainerLagerLeer containerLager;
    private CSVReader csvReader;
    private Random random;
    Wartebereich[][] wartebereichArray = new Wartebereich[20][30];

    private Warteschlange[] queue;


    public Airport() {
        this.random = new Random();
        this.containerLager = new ContainerLagerLeer();
        this.csvReader = new CSVReader();
        BaggageLager baggageLager = new BaggageLager();
        allBaggage = csvReader.baggages.toArray(new Baggage[csvReader.getBaggages().size()]);
        checkInDesk = new CheckInDesk[10];
        Wartebereich[][] wartebereich = new Wartebereich[20][30];
        buildCheckInDesk();
        generateWarteplaetze();

        joinWarteschlange();
        leaveWarteschlange();


    }

    private void joinWarteschlange() {
        List<Passenger> passengers = csvReader.getPassengers();
        int passengerIndex = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (passengerIndex < passengers.size()) {
                    checkInDesk[i].getWarteschlange().addToQueue(passengers.get(passengerIndex));
                    passengerIndex++;
                } else {
                    System.out.println("Alle in Reihen");
                    return;
                }
            }
        }
    }

    private void leaveWarteschlange() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                Passenger leavingPassanger = checkInDesk[i].getWarteschlange().removeFromQueue();
                if (passenger != null) {
                    checkInDesk[i].processPassenger(leavingPassanger);
                    chooseRandomPlace(leavingPassanger);
                }

            }
        }
    }


    private void buildCheckInDesk() {
        for (int i = 0; i < 10; i++) {
            checkInDesk[i] = new CheckInDesk(containerLager, baggageLager);
        }
    }

    public Baggage[] getAllBaggage() {
        return allBaggage;
    }

    public void chooseRandomPlace(Passenger passenger) {
        int col, row;
        do {
            row = random.nextInt(wartebereichArray.length);
            col = random.nextInt(wartebereichArray[0].length);
        } while (wartebereichArray[row][col].isTaken());

        wartebereichArray[row][col].setTaken(true);
        passenger.setSeatWartebereich(wartebereichArray[row][col]);
    }

    private void generateWarteplaetze() {
        for (int i = 0; i < wartebereichArray.length; i++) {
            for (int j = 0; j < wartebereichArray[i].length; j++) {
                wartebereichArray[i][j] = new Wartebereich();
            }
        }
    }
}
