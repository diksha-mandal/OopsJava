package student;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Alice", "Science", 85, 90, 92),
                new Student(102, "Bob", "Arts", 75, 80, 78),
                new Student(103, "Charlie", "Commerce", 65, 70, 68),
                new Student(104, "Dave", "Science", 90, 85, 92),
                new Student(105, "Eve", "Arts", 80, 85, 78),
        };

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

