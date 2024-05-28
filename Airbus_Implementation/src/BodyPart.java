public class BodyPart {
    private String name;
    private String side;



    //Konstruktor Bodypart
        public BodyPart (String name, String side){
        this.name = name;
        this.side = side;
    }

    //Getter
    public String getSide() {
        return side;
    }

    public String getName() {
        return name;
    }
}
