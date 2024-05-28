public class BaggageTag {
    private int sequenceID;

    public BaggageTag(int sequenceID) {
        this.sequenceID = sequenceID;

    }

    public int getSequenceID() {
        return sequenceID;
    }

    @Override
    public String toString() {
        return "BaggageTag{" + "sequenceID=" + sequenceID + '}';
    }
}

