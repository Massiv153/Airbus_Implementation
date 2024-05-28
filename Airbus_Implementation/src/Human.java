import java.time.LocalDate;

public class Human {
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final LocalDate dateOfBirth;
    private final HumanHead head;
    private final HumanBody body;
    private final HumanArm[] humanArms;
    private final HumanHand[] humanHands;
    private final HumanLeg[] humanLegs;
    private final HumanIris humanIris;
    private final HumanFingerprint humanFingerprint;


    public Human(String firstName, String lastName, String gender, LocalDate dateOfBirth, String humanIris, String humanFingerprint) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        humanArms = new HumanArm[2];
        humanHands = new HumanHand[2];
        humanLegs = new HumanLeg[2];
        this.head = new HumanHead();
        this.body = new HumanBody();
        this.humanIris = new HumanIris(humanIris);
        this.humanFingerprint = new HumanFingerprint(humanFingerprint);
    }
    //Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public HumanHead getHead() {
        return head;
    }

    public HumanBody getBody() {
        return body;
    }

    public HumanIris getHumanIris() {
        return humanIris;
    }


}
