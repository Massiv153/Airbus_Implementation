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
    public Baggage removeBaggage(){
        Baggage prioBaggage = sortContainers();
        baggage = prioBaggage;
        prioBaggage = null;
        return baggage;

    }

    public Baggage sortContainers(){
        Baggage highPrioBaggage = null;
        int highestPrio = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    if (assignPriority(lager[j][k][i]) > highestPrio){
                        highestPrio = assignPriority(lager[j][k][i]);
                        highPrioBaggage = lager[j][k][i];
                    }

                }
            }
        }
        return highPrioBaggage;
    }


    private int assignPriority(Baggage baggage){
        switch (baggage.getPriority()){
            case Priority.BUSINESS:
                return 3;
            case Priority.PREMIUM_ECONOMY:
                return 2;
            case Priority.ECONOMY:
                return 1;
            default: return 0;
        }
    }
}

