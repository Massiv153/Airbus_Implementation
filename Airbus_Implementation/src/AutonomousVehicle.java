public class AutonomousVehicle {
    private Lift liftRight;
    private Lift liftLeft;

    private BaggageLager baggageLager;

    public AutonomousVehicle(Lift liftRight, Lift liftLeft, BaggageLager baggageLager){
        this.liftLeft = liftLeft;
        this.liftRight = liftRight;
        this.baggageLager = baggageLager;
    }

    public void moveContainer(Container container, LiftDirection direction){
        baggageLager.getFullContainers().remove(container);
        if(direction == LiftDirection.LEFT){
            if (liftLeft.isUp()){
                liftLeft.setUp(false);
                liftLeft.moveUp(container);
            }else{
                liftLeft.moveUp(container);
            }
        }else {
            if (liftRight.isUp()) {
                liftRight.setUp(false);
                liftRight.moveUp(container);
            } else {
                liftRight.moveUp(container);
            }
        }
    }
}
