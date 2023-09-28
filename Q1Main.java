import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sladegovender
 */
public class AssignmentOne {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean closeProgram = false;
        int menuChoice;
        ArrayList<Student> students = new ArrayList<Student>();
        
        
         //welcome the user to the program
        int start = Integer.parseInt(JOptionPane.showMessageDialog("STUDENT MANAGEMENT APPLICATION"
                + "\n ************************"
                + "\n Enter (1) to launch menu or any other key to exit"));
        if (start != 1)
        {
            closeProgram = true;
        }
        
        //main menu, to loop until quit is chosen
        while (!closeProgram){
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select one of the following menu items:"
                    + "\n (1) Capture a new student."
                    + "\n (2) Search for a student."
                    + "\n (3) Delete a student."
                    + "\n (4) Print a student report"
                    + "\n (5) Exit Application" ));
            
                    //switch to choose a valid option
            switch (menuChoice){
                
                case 1 : Student.SaveStudent(students, scanner);
                         break;
                
                case 2 : System.out.println(Student.SearchStudent(students, scanner));
                         break;
                
                case 3 : Student.DeleteStudent(students, scanner);
                         break;         
                         
                case 4 : Student.StudentReport(students)         ;
                         break;

                case 5 : JOptionPane.showMessageDialog(null, "Quitting program..."); closeProgram = true; break;
                default : JOptionPane.showMessageDialog(null, "Please enter a valid option"); break;
            }
                    
           
         

        
        
    }
}
}
