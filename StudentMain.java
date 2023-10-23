package task5;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(name, rollNumber, grade);
                    system.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    scanner.nextLine();  
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully.");
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    scanner.nextLine();  
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    system.displayAllStudents();
                    break;

                case 5:
                    
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
