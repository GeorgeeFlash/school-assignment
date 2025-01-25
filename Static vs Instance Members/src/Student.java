public class Student {
    private  static int studentCount = 0;
    private String name;

    Student(String name) {
        this.name = name;
        studentCount++;
    }

    static int getStudentCount() {
        return studentCount;
    }
}
