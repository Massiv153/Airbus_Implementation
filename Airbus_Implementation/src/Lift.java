public class Lift {
    private boolean isUp;
    private CargoArea cargoArea;
    private LiftDirection liftDirection;

    public Lift(CargoArea cargoArea, LiftDirection liftDirection){
        this.isUp = false;
        this.cargoArea = cargoArea;
        this.liftDirection = liftDirection;
    }

    public void moveUp(Container container){
        isUp = true;
        if (liftDirection == LiftDirection.LEFT){
            for (int i = 0; i < cargoArea.getCargoLeft().length; i++) {
                if(cargoArea.getCargoLeft()[i] == null){
                    cargoArea.getCargoLeft()[i] = container;
                }
            }
        }else{
            for (int i = 0; i < cargoArea.getCargoRight().length; i++) {
                if(cargoArea.getCargoRight()[i] == null){
                    cargoArea.getCargoRight()[i] = container;
                }
            }
        }
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }
}
