public class RobotArm {
    private final ConveyorBelt conveyorBelt;
    private final BaggageLager baggageLager;
    private final ContainerLagerLeer containerLagerLeer;
    private Container container;
    private final Container[] fullContainers;
    private int fullContainerIndex;

    public RobotArm(ConveyorBelt conveyorBelt, BaggageLager baggageLager, ContainerLagerLeer containerLagerLeer){
        this.conveyorBelt = conveyorBelt;
        this.baggageLager = baggageLager;
        this.containerLagerLeer = containerLagerLeer;
        container = takeContainer();
        fullContainers = new Container[8];
        fullContainerIndex = 0;

    }
    public void addBaggagetoLager(){
        if (conveyorBelt.getBaggage() != null){
            conveyorBelt.removeBaggage();
            baggageLager.addBaggage(conveyorBelt.getBaggage());

        } else if (conveyorBelt.getBaggage() == null && baggageLager.countBaggages() > 0) {
            addBaggagetoContainer();
        }
    }

    public void addBaggagetoContainer(){
        int[] priorityToLoad  = calculateBaggageInContainer();
        while (baggageLager.countBaggages() > 0) {
            for (int priority = 0; priority < 3; priority++){
                for (int i = 0; i < priorityToLoad [priority]; i++){
                    Baggage baggage = baggageLager.findAndRemoveBaggageByPriority(priority);
                        if (baggage != null){
                            if (container != null && !container.isFull()) {
                                container.push(baggage);
                            }
                            else {
                                System.out.println("Alle Container voll");
                                return;
                            }
                        }
                        else{
                                System.out.println("Gepäck ist verladen");
                                return;
                            }
                }
            }

            fullContainers[fullContainerIndex++] = container;
            container = takeContainer();
            priorityToLoad  = calculateBaggageInContainer();
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

    private int [] calculateBaggageInContainer(){
        if (container == null){
            return null;
        }
        int[] priorityCounts = baggageLager.countBaggagesbyPriority();
        int highPriorityCount = priorityCounts[2];
        int midPriorityCount = priorityCounts[1];
        int lowPriorityCount = priorityCounts[0];
        int remainingCapacity = container.getRemainingCapacity();

        int [] priorityToLoad = new int[3];
        //Gibt den kleineren Wert zurück
        int highPriorityToLoad = Math.min(highPriorityCount, remainingCapacity);
        int midPriorityToLoad = Math.min(midPriorityCount, remainingCapacity - highPriorityToLoad);
        int lowPriorityToLoad = Math.min(lowPriorityCount, remainingCapacity - highPriorityToLoad - midPriorityToLoad);
        priorityToLoad[2] = highPriorityToLoad;
        priorityToLoad[1] = midPriorityToLoad;
        priorityToLoad[0] = lowPriorityToLoad;

        return priorityToLoad;
    }

    public Container[] getFullContainers() {
        return fullContainers;
    }

}
