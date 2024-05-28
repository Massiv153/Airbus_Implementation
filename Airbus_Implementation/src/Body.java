public class Body {
    private Cabin businessClass;
    private Cabin premiumClass;
    private Cabin[] economy;

    public Body(){
        this.economy = new Cabin[5];
        this.businessClass = new Cabin(CabinType.BUSINESS_CLASS, 1, 8, new char[] {'A','C','D','G','H','K'}, 48);
        this.premiumClass = new Cabin(CabinType.PREMIUM_ECONOMY, 12, 15, new char[] {'A','C','D','E','G','H','K'}, 21);
        this.economy[0] = new Cabin(CabinType.ECONOMY, 16, 16, new char[] {'A','C','D','E','G'}, 5);
        this.economy[1] = new Cabin(CabinType.ECONOMY, 18, 26, new char[] {'A','B','C','D','E','G','H','J','K'}, 81);
        this.economy[2] = new Cabin(CabinType.ECONOMY, 27, 27, new char[] {'B','C','D','E','G','H','J'}, 7);
        this.economy[3] = new Cabin(CabinType.ECONOMY, 28, 41, new char[] {'A','B','C','D','E','G','H','J','K'}, 126);
        this.economy[3] = new Cabin(CabinType.ECONOMY, 42, 42, new char[] {'A','C','D','E','G'}, 5);
    }

    public String toString(){
        return economy.toString()+"\n"+premiumClass.toString()+"\n"+createString()+"\n: "+calculateSeats();
    }

    private String createString(){
        String s = "";
        for (int i = 0; i < economy.length; i++) {
            s = s+economy[i].toString()+"\n";
        }
        return s;
    }

    private int calculateSeats(){
        int sum = businessClass.getSeatsOverall()+ premiumClass.getSeatsOverall();
        for (int i = 0; i < economy.length; i++) {
            sum = sum+economy[i].getSeatsOverall();
        }
        return sum;
    }

    public Cabin getPremiumClass() {
        return premiumClass;
    }

    public Cabin[] getEconomy() {
        return economy;
    }

    public Cabin getBusinessClass() {
        return businessClass;
    }

}
