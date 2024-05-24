public class Printer {
    private CheckInDesk checkInDesk;

    public void printBaggageTag(BaggageTag baggageTag) {
        System.out.println("Printed Baggage Tag: " + baggageTag.getSequenceID());
    }

    public void printBoardingPass(Passenger passenger) {
        System.out.println("Printed Boarding Pass for: " + passenger.getFirstName() + passenger.getLastName());
    }
}
