public class LowPressureCompressor {
    private Unit frontUnit;
    private Unit backUnit;

    public LowPressureCompressor(){
        this.frontUnit = new Unit(36, BladeSize.M);
        this.backUnit = new Unit(36, BladeSize.M);
    }
}
