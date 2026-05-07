package mikyla;


class Car {
    // Fields (Attributes)
    String make;
    String model;
    int year;
    String color;

    // Constructor to initialize the Car object
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }

    // Method to start the car
    void start() {
        System.out.println(make + " " + model + " is starting...");
    }

    // Method to stop the car
    void stop() {
        System.out.println(make + " " + model + +" is stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020, "Blue");
        Car yourCar = new Car("Honda", "Civic", 2018, "Red");

        // Calling methods using objects
        myCar.displayInfo();
        myCar.start();
        myCar.stop();

        System.out.println(); // Print an empty line between the two cars' info

        yourCar.displayInfo();
        yourCar.start();
        yourCar.stop();
    }
}
