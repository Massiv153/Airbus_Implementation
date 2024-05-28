public class RobotArm {
    private final ConveyorBelt conveyorBelt;
    private final BaggageLager baggageLager;
    private final ContainerLagerLeer containerLagerLeer;
    private Container container;

    public RobotArm(ConveyorBelt conveyorBelt, BaggageLager baggageLager, ContainerLagerLeer containerLagerLeer){
        this.conveyorBelt = conveyorBelt;
        this.baggageLager = baggageLager;
        this.containerLagerLeer = containerLagerLeer;
        container = takeContainer();

    }
    public void addBaggagetoLager(){
        if (conveyorBelt.getBaggage() != null){
            conveyorBelt.removeBaggage();
            baggageLager.addBaggage(conveyorBelt.getBaggage());
            addBaggagetoContainer();
        }

    }

    public void addBaggagetoContainer(){
        Baggage baggage = baggageLager.removeBaggage();
        if (container != null && !container.isFull()){
            container.push(baggage);
        } else if (container != null && container.isFull()) {
            container = takeContainer();
            container.push(baggage);
        } else {
            System.out.println("Alle Container voll");
        }

    }

    private Container takeContainer(){
        if (containerLagerLeer.getContainer() != null) {
            container = containerLagerLeer.getContainer();
            containerLagerLeer.removeContainer();
            return container;
        }
        else {
            System.out.println("Keine Container mehr vorhanden");
            return null;
        }
    }

}
