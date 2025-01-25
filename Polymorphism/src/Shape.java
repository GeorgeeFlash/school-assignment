abstract class Shape {
    abstract double calculateArea();

    void printShapeArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}
