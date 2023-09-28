import java.util.Scanner;

/**
 *
 * @author sladegovender
 *///Problem : Create a student grading system that allows instructors to input grades for students, calculate their average grades, and generate a report card

class Student {
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCourses = 5; // Number of courses for grading

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student type (U for undergraduate, G for graduate): ");
            char studentType = scanner.nextLine().charAt(0);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (studentType == 'U') {
                System.out.print("Enter undergraduate year: ");
                int year = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                students[i] = new UndergraduateStudent(name, studentId, numCourses, year);
            } else if (studentType == 'G') {
                System.out.print("Enter graduate advisor: ");
                String advisor = scanner.nextLine();
                students[i] = new GraduateStudent(name, studentId, numCourses, advisor);
            }

            System.out.println("Enter grades for " + students[i].getName() + " (Enter -1 to skip):");
            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                double grade = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                if (grade >= 0) {
                    students[i].setGrade(j, grade);
                }
            }
        }

        // Generate report card for each student
        System.out.println("\nReport Cards:\n");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student Name: " + students[i].getName());
            System.out.println("Student ID: " + students[i].getStudentId());

            if (students[i] instanceof UndergraduateStudent) {
                System.out.println("Student Type: Undergraduate");
                System.out.println("Year: " + ((UndergraduateStudent) students[i]).getYear());
            } else if (students[i] instanceof GraduateStudent) {
                System.out.println("Student Type: Graduate");
                System.out.println("Advisor: " + ((GraduateStudent) students[i]).getAdvisor());
            }

            double averageGrade = students[i].calculateAverageGrade();
            System.out.println("Average Grade: " + averageGrade + "\n");
        }
    }
}
    

