public class Car {
    String make, model, color;
    int year;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("CAR DETAILS");
        System.out.println("************");
        System.out.println("\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color);
    }
}
