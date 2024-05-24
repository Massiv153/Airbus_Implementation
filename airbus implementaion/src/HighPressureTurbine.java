public class HighPressureTurbine {
    private Unit frontUnit;
    private Unit backUnit;

    public HighPressureTurbine(){
        this.frontUnit = new Unit(36, BladeSize.M);
        this.backUnit = new Unit(36, BladeSize.M);
    }
}
