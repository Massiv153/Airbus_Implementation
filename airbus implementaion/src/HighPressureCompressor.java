public class HighPressureCompressor {
    private Unit[] units;

    public HighPressureCompressor(){
        this.units = new Unit[6];
        this.units[0] = new Unit(36, BladeSize.S);
        this.units[1] = new Unit(36, BladeSize.S);
        this.units[2] = new Unit(32, BladeSize.S);
        this.units[3] = new Unit(32, BladeSize.S);
        this.units[4] = new Unit(30, BladeSize.S);
        this.units[5] = new Unit(30, BladeSize.S);
    }
}
