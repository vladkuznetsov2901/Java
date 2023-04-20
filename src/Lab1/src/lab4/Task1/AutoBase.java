package Lab1.src.lab4.Task1;

import java.util.Random;

enum State{
    ON_BASE,
    ON_TRIP,
    ON_REPAIR
}

public class AutoBase {
    private Car[] cars;
    private int size;
    private final int capacity;

    public AutoBase(int capacity) {
        this.capacity = capacity;
        cars = new Car[capacity];
        size = 0;
    }

    public void addCar(Car car) {
        if (size >= capacity) {
            System.out.println("No more space on the autobase.");
            return;
        }
        cars[size] = car;
        size++;
    }

    public void removeCar(int index) {
        if (index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            cars[i] = cars[i + 1];
        }
        size--;
    }

    public void sendToTrip(int index) {
        if (index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Car car = cars[index];
        if (car.getState() != State.ON_BASE) {
            System.out.println("Car is not on base.");
            return;
        }
        car.setState(State.ON_TRIP);
    }

    public void sendToRepair(int index) {
        if (index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Car car = cars[index];
        if (car.getState() != State.ON_BASE) {
            System.out.println("Car is not on base.");
            return;
        }
        car.setState(State.ON_REPAIR);
    }

    public void returnFromTrip(int index) {
        if (index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Car car = cars[index];
        if (car.getState() != State.ON_TRIP) {
            System.out.println("Car is not on trip.");
            return;
        }
        car.setState(State.ON_BASE);
    }

    public void returnFromRepair(int index) {
        if (index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Car car = cars[index];
        if (car.getState() != State.ON_REPAIR) {
            System.out.println("Car is not on repair.");
            return;
        }
        car.setState(State.ON_BASE);
    }

    public void showOnBase() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Cars on base:");
        for (int i = 0; i < size; i++) {
            if (cars[i].getState() == State.ON_BASE) {
                System.out.println(i + ". " + cars[i].getType() + "," + cars[i].getState());
            }
        }
    }

    public void showOnTrip() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Cars on trip:");
        for (int i = 0; i < size; i++) {
            if (cars[i].getState() == State.ON_TRIP) {
                System.out.println(i + ". " + cars[i].getType() + "," + cars[i].getState());
            }
        }
    }

    public void showOnRepair() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Cars on repair:");
        for (int i = 0; i < size; i++) {
            if (cars[i].getState() == State.ON_REPAIR) {
                System.out.println(i + ". " + cars[i].getType() + "," + cars[i].getState());
            }
        }
    }

    public void setState(){
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            int a = random.nextInt(3);
            switch (a){
                case 0 -> cars[i].setState(State.ON_BASE);
                case 1 -> cars[i].setState(State.ON_REPAIR);
                case 2 -> cars[i].setState(State.ON_TRIP);
            }

        }
    }

    public void printAutoBase() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("All cars:");
        for (int i = 0; i < size; i++) {
                System.out.println(i + ". " + cars[i].getType() + "," + cars[i].getState());
        }
    }
}
