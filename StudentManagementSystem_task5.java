package task5;

public class StudentManagementSystem_task5 {
    private Student_task5[] students;
    private int count;

    public StudentManagementSystem_task5(int capacity) {
        students = new Student_task5[capacity];
        count = 0;
    }

    public void addStudent(Student_task5 student) {
        if (count < students.length) {
            students[count++] = student;
        } else {
            System.out.println("Maximum capacity reached. Cannot add more students.");
        }
    }

    public void removeStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public Student searchStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                return students[i];
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
            }
        } else {
            System.out.println("No students found.");
        }
    }
}
