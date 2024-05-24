public class RobotArm {
    private ConveyorBelt conveyorBelt;
    private BaggageLager baggageLager;
    private Container [] containers;
    public RobotArm(ConveyorBelt conveyorBelt, BaggageLager baggageLager, Container [] containers){
        this.conveyorBelt = conveyorBelt;
        this.containers = containers;
        this.baggageLager = baggageLager;
    }
    public void addBaggagetoLager(){
        if (conveyorBelt.getBaggage() != null){
            conveyorBelt.removeBaggage();
            baggageLager.addBaggage(conveyorBelt.getBaggage());
        }
    }

    public void addBaggagetoContainer(Container[] containers){
        Baggage baggage = baggageLager.removeBaggage();
        for (int i = 0; i< 8; i++) {
            if (!containers[i].isFull()) {
                containers[i].storeBaggage(baggage);
            }
        }
    }


}
