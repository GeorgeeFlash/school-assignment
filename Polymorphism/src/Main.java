public class Main {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape circle = new Circle(5);
        Shape rectancle = new Rectangle(4, 6);

        // Demonstrate polymorphism by passing shapes to a method
        printShapeArea(circle); // Outputs: Area: 78.53981633974483
        printShapeArea((rectancle)); // Outputs: Area: 24.0
    }

    // Method that takes a Shape object and prints its area
    public  static void printShapeArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}