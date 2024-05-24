import java.util.Random;

public class Reader {
    private CheckInDesk checkInDesk;

    public boolean scanPassport() {
        return new Random().nextBoolean();
    }

    public boolean scanIris() {
        return new Random().nextBoolean();
    }

    public boolean scanFingerprint() {
        return new Random().nextBoolean();
    }
}
