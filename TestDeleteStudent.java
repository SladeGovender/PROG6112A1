import com.assignmentone.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDeleteStudent {
    public static void DeleteStudent(ArrayList<Student> students, Scanner scanner){
        
        System.out.println("Enter the students ID to delete:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Are you sure you want to delete student " + id + "? Yes (y) to confirm ");
        String delete = scanner.nextLine();
        if (delete == "y")
        {
            for (int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getStudentID() == id)
                {
                    students.remove(i);
                    System.out.println("Student" + id + "was DELETED!!!");
                    return;
                }
            }
            System.out.println("Student ID:" + id + " was not found!!!");
        }
        
    }
}
