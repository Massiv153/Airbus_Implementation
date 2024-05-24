public class FuelManagement {
    private Tank centerTank;
    private Tank leftTank;
    private Tank rightTank;
    private JetEngine leftEngine;
    private JetEngine rightEngine;

    private boolean isCenterUsed;

    public FuelManagement(Tank centerTank, Tank leftTank, Tank rightTank, JetEngine leftEngine, JetEngine rightEngine){
        this.centerTank = centerTank;
        this.leftTank = leftTank;
        this.rightTank = rightTank;
        this.leftEngine = leftEngine;
        this.rightEngine = rightEngine;
        this.isCenterUsed = false;
    }

    public void fuelEngine(){
        if (leftEngine.isActive() && rightEngine.isActive()){
            if (isCenterUsed && centerTank.getFuel()-calculateFuelConsumtion()>=0){
                centerTank.setFuel(centerTank.getFuel()-calculateFuelConsumtion());
            }else{
                if(leftTank.getFuel()-calculateFuelConsumtion()>= leftTank.getCapacity()/10 && rightTank.getFuel()-calculateFuelConsumtion()>= rightTank.getCapacity()/10){
                    leftTank.setFuel(leftTank.getFuel()-calculateFuelConsumtion());
                    rightTank.setFuel(rightTank.getFuel()-calculateFuelConsumtion());
                }else{
                    System.out.println("Switching to Center Tank!");
                    isCenterUsed = true;
                    centerTank.setFuel(centerTank.getFuel()-calculateFuelConsumtion());
                }
            }
        }else{
            System.out.println("The Engines are offline!");
        }
    }

    private int calculateFuelConsumtion(){
        return leftEngine.getSpeed()*5;
    }

}
