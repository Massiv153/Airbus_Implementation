public class Fan {
    private Unit frontUnit;
    private Unit backUnit;

    public Fan(){
        this.frontUnit = new Unit(48, BladeSize.L);
        this.backUnit = new Unit(45, BladeSize.L);
    }
}
