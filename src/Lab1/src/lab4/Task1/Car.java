package Lab1.src.lab4.Task1;
import java.util.regex.*;

enum CarType {
    SEDAN,
    SPECIAL,
    TRUCK,
    BUS
}

public abstract class Car {
    private String regNumber;
    private String brand;
    private CarType type;
    private String color;
    private final Engine engine;
    private State state; // 0 - на базе, 1 - в рейсе, 2 - в ремонте

    public Car(String brand, CarType type, String color, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.engine = engine;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        String regNumberPattern = "[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS";
        if (regNumber != null && !Pattern.matches(regNumberPattern, regNumber)) {
            throw new IllegalArgumentException("Invalid registration number format");
        }
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printInfo() {
        System.out.println("Registration number: " + regNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Engine power: " + engine.getPower());
        int numWheels = 4;
        System.out.println("Number of wheels: " + numWheels);
    }
}

