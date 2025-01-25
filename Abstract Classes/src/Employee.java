// Abstract class representing a generic employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    abstract  double calculateSalary();
}
