public class Main {

    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        
        // Display the total number of students using a static method
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}