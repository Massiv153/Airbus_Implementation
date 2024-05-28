public class JetEngineMediator implements IJetEngineMediator{
    private JetEngine leftEngine;
    private JetEngine rightEngine;

    public JetEngineMediator(JetEngine leftEngine, JetEngine rightEngine){
        this.leftEngine = leftEngine;
        this.rightEngine = rightEngine;
    }

    public void startup(){
        leftEngine.setActive(true);
        rightEngine.setActive(true);
    }

    public void setSpeed(int mph){
        leftEngine.setSpeed((int) (mph*Configuration.INSTANCE.milesInKilometer));
        rightEngine.setSpeed((int) (mph*Configuration.INSTANCE.milesInKilometer));
    }

    public void shutdown(){
        leftEngine.setActive(false);
        rightEngine.setActive(false);
    }
}
