import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sladegovender
 */
public class Student {
    
    Scanner scanner = new Scanner(System.in);
    int studentID;
    String studentName;
    int studentAge;
    String studentEmail;
    String studentCourse;
    
    public Student(int studentID, String studentName, int studentAge, String studentEmail, String studentCourse){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
                
    }
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
    public int getStudentID() {
           return studentID;
   
}
    public String getStudentName() {
           return studentName;
   
}
    public int getStudentAge() {
           return studentAge;
   
}
    public String getStudentEmail() {
           return studentEmail;
   
}
    public String getStudentCourse() {
           return studentCourse;
   
}
    
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
    public static void StudentReport(ArrayList<Student> students, Scanner scanner){
        for (int i = 0; i < students.size(); i++)
        {
            System.out.println("\n STUDENT " + i+1 
                            +"\n _________________________"
                            + "\n STUDENT ID:" + students.get(i).getStudentID()
                            + "\n STUDENT NAME:" + students.get(i).getStudentName()
                            + "\n STUDENT AGE:" + students.get(i).getStudentAge()
                            + "\n STUDENT COURSE:" + students.get(i).getStudentCourse()
                            + "\n STUDENT EMAIL:" + students.get(i).getStudentEmail() 
                            + "\n_________________________");
        }                   
                        
    }
    public static void ExitStudentApplication(){
    
        System.exit(0);
        
    }
        }
    
        
    
