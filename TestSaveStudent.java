
import com.assignmentone.Student;
import java.util.ArrayList;
import java.util.Scanner;

 *
 * @author sladegovender
 */
public class TestSaveStudent {
    public static void SaveStudent (ArrayList<Student> students, Scanner scanner){
    
        System.out.println("CAPTURE A NEW STUDENT \n ********************** \n Enter the Student ID:");
        int id = scanner.nextInt();
        System.out.println("Enter the Student Name:");
        String name = scanner.nextLine();
        int age;
        System.out.println("Enter the Student Age:");
        do {
            while (!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Invalid Student Age entered. \n Student Age must be greater or equal to 16 ");
            }
            age = scanner.nextInt();
            if(age < 16){
                System.out.println("Invalid Student Age entered. \n Student Age must be greater or equal to 16 ");
                
            }
        }
            while (age > 16); {
                scanner.nextLine();
                System.out.println("Enter the Student Email:");
                String email = scanner.nextLine();
                System.out.println("Enter the Student Course:");
                String course = scanner.nextLine();
                System.out.println("STUDENT DETAILS SUCCESSFULLY CAPTURED!!!");
                Student one = new Student(id,name,age,email,course);
                students.add(one);
                
            }
        
    }
}
