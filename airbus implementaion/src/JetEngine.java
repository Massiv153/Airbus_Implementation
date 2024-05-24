public class JetEngine {
    private Fan fan;
    private LowPressureCompressor lowPressureCompressor;
    private HighPressureCompressor highPressureCompressor;
    private HighPressureTurbine highPressureTurbine;
    private CombustionChamber combustionChamber;

    private boolean isActive;
    private int speed;

    public JetEngine(Fan fan, LowPressureCompressor lowPressureCompressor, HighPressureCompressor highPressureCompressor,
                     HighPressureTurbine highPressureTurbine, CombustionChamber combustionChamber){
        this.fan = fan;
        this.lowPressureCompressor = lowPressureCompressor;
        this.highPressureCompressor = highPressureCompressor;
        this.highPressureTurbine = highPressureTurbine;
        this.combustionChamber = combustionChamber;

        this.isActive = false;
        this.speed = 0;
    }

    public boolean isActive() {
        return isActive;
    }

    public CombustionChamber getCombustionChamber() {
        return combustionChamber;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
