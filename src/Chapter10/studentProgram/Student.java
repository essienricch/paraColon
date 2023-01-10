package Chapter10.studentProgram;

import java.util.ArrayList;
import java.util.List;

public class Student {

    protected static int num_of_registered_student;
    protected String studentName;
    protected String address;
    protected String phoneNumber;
    protected int numberOfClasses;
    protected int totalCreditHours;
    protected List <Courses> courses;


    public Student(String studentName, String address, String phoneNumber, int numberOfClasses, int totalCreditHours) {
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberOfClasses = numberOfClasses;
        this.totalCreditHours = totalCreditHours;
        this.courses = new ArrayList<>();
    }

    public static void setNum_of_registered_student() {
        Student.num_of_registered_student++;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public void setTotalCreditHours() {
        this.totalCreditHours = new Courses().getCreditHours();
    }

    public void setCourses(int creditHours, String courseName) {
        this.courses.add(new Courses(courseName,creditHours));
    }

    public static int getNum_of_registered_student() {
        return num_of_registered_student;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public int getTotalCreditHours() {
        return totalCreditHours;
    }

    public List<Courses> getCourses() {
        return courses;
    }
}


