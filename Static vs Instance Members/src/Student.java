// Class representing a Student
class Student {
    static int studentCount = 0; // Static variable to track the number of students
    String name;

    // Constructor that increments the student count for every new student
    public Student(String name) {
        this.name = name;
        studentCount++;
    }

    // Static method to get the total student count
    public static int getStudentCount() {
        return studentCount;
    }
}
