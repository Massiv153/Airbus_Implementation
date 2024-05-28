import java.util.List;

public class BaggageLager {
    private Baggage[][][] lager;
    private CheckInDesk checkInDesk;
    private Baggage baggage;

    public BaggageLager(){
        lager = new Baggage[10][10][5];


    }

    public void addBaggage(Baggage baggage) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    if (lager[i][j][k] == null) {
                        lager[i][j][k] = baggage;
                    }
                }
            }
        }
    }



    public Baggage findAndRemoveBaggageByPriority(int targetPriority) {
        Baggage foundBaggage = null;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    Baggage baggage = lager[j][k][i];
                    if (baggage != null && assignPriority(baggage) == targetPriority) {
                        foundBaggage = baggage;
                        lager[j][k][i] = null;
                        return foundBaggage;
                    }
                }
            }
        }
        return foundBaggage;



    }

    private int assignPriority(Baggage baggage){
        switch (baggage.getPriority()){
            case BookingClass.BUSINESS:
                return 3;
            case BookingClass.PREMIUM_ECONOMY:
                return 2;
            case BookingClass.ECONOMY:
                return 1;
            default: return 0;
        }
    }

    public int countBaggages(){
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    if (lager[i][j][k] != null){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int[] countBaggagesbyPriority(){
        int [] count = new int[3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    Baggage baggage = lager[j][k][i];
                    if (baggage != null) {
                        int priority = assignPriority(baggage);
                        count[priority - 1]++;
                    }
                }
            }
        }
        return count;
    }
}

