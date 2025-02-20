package LAB_5;

// Abstract class with common vehicle properties and methods
abstract class Vehicle {
    protected String make;
    protected String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract methods (to be implemented by subclasses)
    public abstract void startEngine();
    public abstract void stopEngine();

    // Concrete method (non-abstract)
    public void serviceInfo() {
        System.out.println("Servicing Instructions for " + make + " " + model + ":");
        System.out.println("- Change engine oil every 10,000 miles.");
        System.out.println("- Check tire pressure regularly.");
        System.out.println("- Inspect brakes and battery health.");
    }
}
// Concrete class extending Vehicle and implementing abstract methods
class Car extends Vehicle {

    // Constructor calling parent constructor
    public Car(String make, String model) {
        super(make, model);
    }

    // Implementation of abstract method startEngine
    @Override
    public void startEngine() {
        System.out.println(make + " " + model + " engine started. ");
    }

    // Implementation of abstract method stopEngine
    @Override
    public void stopEngine() {
        System.out.println(make + " " + model + " engine stopped. ");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        // Instantiate a Car object
        Car myCar = new Car("Toyota", "Camry");

        // Call methods
        myCar.startEngine();  // Calls implemented method
        myCar.serviceInfo();  // Calls inherited concrete method
        myCar.stopEngine();   // Calls implemented method
    }
}
