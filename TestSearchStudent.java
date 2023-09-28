
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sladegovender
 */
public class TestSearchStudent {
     public static String SearchStudent(ArrayList<Student> students, Scanner scanner){
        
        System.out.println("Enter the Student ID:");
        int id = scanner.nextInt();
        String fb = "Student ID " + id + " cannot be found!";
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getStudentID()== id)
            {
                fb = "************************"
                        + "\n STUDENT ID: " + students.get(i).getStudentID()
                        + "\n STUDENT NAME: " + students.get(i).getStudentName()
                        + "\n STUDENT AGE: " + students.get(i).getStudentAge()
                        + "\n STUDENT EMAIL: " + students.get(i).getStudentEmail()
                        + "\n STUDENT COURSE: " + students.get(i).getStudentCourse()
                        + "************************";
                break;
            }
        }
        return fb;
                        
    }
}
