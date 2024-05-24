public class LowPressureTurbine {
    private Unit frontUnit;
    private Unit backUnit;

    public LowPressureTurbine(){
        this.frontUnit = new Unit(36, BladeSize.M);
        this.backUnit = new Unit(36, BladeSize.M);
    }
}
