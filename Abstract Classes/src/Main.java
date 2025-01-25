public class Main {
    public static void main(String[] args) {
        // Create instances of employees
        Employee fullTime = new FullTimeEmployee("Alice", 1, 50000);
        Employee partTime = new PartTimeEmployee("Bob", 2, 20, 1200);

        // Display their salaries
        System.out.println("Full-time Employee Salary: $" + fullTime.calculateSalary());
        System.out.println("Part-time Employee Salary: $" + partTime.calculateSalary());

    }
}