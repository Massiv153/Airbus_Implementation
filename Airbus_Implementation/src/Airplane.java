import java.util.Date;

public class Airplane {
    private Body body;
    private Wing leftWing;
    private Wing rightWing;
    private CargoArea cargoArea;

    private final String manufacturer;
    private final String model;
    private final double overallLength;
    private final double cabinLength;
    private final double wingSpan;
    private final double height;
    private final int range;
    private final String mmo;
    private final int maximumTakeoffWeight;
    private final double enginePower;
    private final double cruisingSpeed;
    private final double fuelConsumption;
    private final String id;
    private String carrier;
    private final String serialNumber;
    private final Date manufacturingDate;
    private final String delivery;

    public Airplane (Body body, Wing leftWing, Wing rightWing, CargoArea cargoArea, String manufacturer, String model, double overallLength,
                     double cabinLength, double wingSpan, double height, int range, String mmo, int maximumTakeoffWeight,
                     double enginePower, double cruisingSpeed, double fuelConsumption, String id, String carrier,
                     String serialNumber, Date manufacturingDate, String delivery){
        this.body = body;
        this.leftWing = leftWing;
        this.rightWing = rightWing;
        this.cargoArea = cargoArea;
        this.manufacturer = manufacturer;
        this.model = model;
        this.overallLength = overallLength;
        this.cabinLength = cabinLength;
        this.wingSpan = wingSpan;
        this.height = height;
        this.range = range;
        this.mmo = mmo;
        this.maximumTakeoffWeight = maximumTakeoffWeight;
        this.enginePower = enginePower;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.carrier = carrier;
        this.serialNumber = serialNumber;
        this.manufacturingDate = manufacturingDate;
        this.delivery = delivery;
    }
}
