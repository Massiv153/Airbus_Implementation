import java.time.LocalDate;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private HumanHead head;
    private HumanBody body;
    private HumanArm leftarm;
    private HumanArm rightarm;
    private HumanHand lefthand;
    private HumanHand righthand;
    private HumanLeg leftLeg;
    private HumanLeg rightLeg;

    public Human(String firstName, String lastName, String gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.head = new HumanHead();
        this.body = new HumanBody();
        this.leftarm = new HumanArm("left");
        this.rightarm = new HumanArm("right");
        this.lefthand = new HumanHand("left");
        this.righthand = new HumanHand("right");
        this.leftLeg = new HumanLeg("left");
        this.rightLeg = new HumanLeg("right");
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

    public HumanArm getLeftarm() {
        return leftarm;
    }

    public HumanArm getRightarm() {
        return rightarm;
    }

    public HumanHand getLefthand() {
        return lefthand;
    }

    public HumanHand getRighthand() {
        return righthand;
    }

    public HumanLeg getLeftLeg() {
        return leftLeg;
    }

    public HumanLeg getRightLeg() {
        return rightLeg;
    }


}
