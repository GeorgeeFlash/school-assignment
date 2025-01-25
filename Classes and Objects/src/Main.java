public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2022, "White");
        Car car2 = new Car("Honda", "Civic", 2021, "Black");

        // Call the displayInfo method to print car details
        car1.displayInfo();
        car2.displayInfo();
    }
}