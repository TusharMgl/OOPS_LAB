package LAB_7;

interface Vehicle {
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle {
    private double fuelLevel = 50;
    
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}

class Motorcycle implements Vehicle {
    private double fuelLevel = 20;

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        car.start();
        System.out.println("Car Fuel Level: " + car.getFuelLevel());
        car.stop();
        
        motorcycle.start();
        System.out.println("Motorcycle Fuel Level: " + motorcycle.getFuelLevel());
        motorcycle.stop();
    }
}
