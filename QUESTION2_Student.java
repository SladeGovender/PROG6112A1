class Student {
    private String name;
    private int studentId;
    private double[] grades;

    public Student(String name, int studentId, int numCourses) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new double[numCourses];
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrade(int courseNumber, double grade) {
        if (courseNumber >= 0 && courseNumber < grades.length) {
            grades[courseNumber] = grade;
        }
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}

// Subclass for undergraduate students
class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(String name, int studentId, int numCourses, int year) {
        super(name, studentId, numCourses);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

// Subclass for graduate students
class GraduateStudent extends Student {
    private String advisor;

    public GraduateStudent(String name, int studentId, int numCourses, String advisor) {
        super(name, studentId, numCourses);
        this.advisor = advisor;
    }

    public String getAdvisor() {
        return advisor;
    }
}
