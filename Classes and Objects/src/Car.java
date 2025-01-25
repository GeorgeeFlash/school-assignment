// Class representing a car with basic properties and a method
public class Car {
    String make, model, color; // Fields to store car details
    int year;

    // Constructor to initialize the car's properties
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display the car's information
    void displayInfo() {
        System.out.println("CAR DETAILS");
        System.out.println("************");
        System.out.println("\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color);
    }
}
