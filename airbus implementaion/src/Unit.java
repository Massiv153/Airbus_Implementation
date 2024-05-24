public class Unit {
    private Blade[] blade;

    public Unit(int bladeCount, BladeSize bladeSize){
        blade = new Blade[bladeCount];
        for (int i = 0; i < bladeCount; i++) {
            blade[i] = new Blade(bladeSize);
        }
    }
}
