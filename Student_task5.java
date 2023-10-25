package task5;

public class Student_task5{
    private String name;
    private int rollNumber;
    private String grade;

    public Student_task5(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

