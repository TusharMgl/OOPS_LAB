class Car {
    String make, model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayCar() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class l4q4{
    public static void main(String[] args) {
        Car myCar = new Car("TOYOTA", "Model 2", 2023);
        myCar.displayCar();
    }
}
