public class Tank {
    private int capacity;
    private int fuel;

    public Tank(int length, int width, int height){
        this.capacity = length*width*height;
        this.fuel = this.capacity;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }
}
