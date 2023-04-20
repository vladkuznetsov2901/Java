package Lab1.src.lab4.Task1;

public class Engine {
    private String serialNumber;
    private double power;
    private double displacement;
    private double fuelConsumption;
    private String fuelType;
    private int numberOfCylinders;

    public Engine(String serialNumber, double power, double displacement, double fuelConsumption, String fuelType, int numberOfCylinders) {
        this.serialNumber = serialNumber;
        this.power = power;
        this.displacement = displacement;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPower() {
        return power;
    }

    public double getDisplacement() {
        return displacement;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
}
