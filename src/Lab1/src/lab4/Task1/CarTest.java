package Lab1.src.lab4.Task1;

import java.util.Random;

public class CarTest {
    public static void main(String[] args) {
        Engine engine = new Engine("123456789", 150, 2.0, 7.5, "gasoline", 4);
        Sedan sedan = new Sedan("Toyota","Black", engine);
        Bus bus = new Bus("Toyota","Blue", engine);
        Special ambulance = new Special("Toyota","Blue", engine);
        sedan.printInfo();
        sedan.setRegNumber("У001УУ77RUS");
        sedan.printInfo();
        sedan.setColor("Blue");
        sedan.printInfo();
        System.out.println(sedan.getBrand());
        System.out.println("Serial Number: " + sedan.getEngine().getSerialNumber());
        System.out.println("Fuel Consumption: " + sedan.getEngine().getFuelConsumption() + " L/100 km");
        System.out.println("Fuel Type: " + sedan.getEngine().getFuelType());
        System.out.println("Number of Cylinders: " + sedan.getEngine().getNumberOfCylinders());

        AutoBase autoBase = new AutoBase(10);

        for (int i = 0; i < 10; i++){
            Random random = new Random();
            int a = random.nextInt(3);
            switch (a){
                case 0 -> autoBase.addCar(sedan);
                case 1 -> autoBase.addCar(bus);
                case 2 -> autoBase.addCar(ambulance);
            }

        }

        autoBase.setState();

        autoBase.printAutoBase();

        autoBase.showOnRepair();

        autoBase.showOnBase();

        autoBase.showOnTrip();

        autoBase.sendToTrip(1);

        autoBase.printAutoBase();

    }
}
