package Chapter10.studentProgram;

public class Courses {

    private String nameOfCourse;
    private int creditHours;

    public Courses(String nameOfCourse, int creditHours) {
        this.nameOfCourse = nameOfCourse;
        this.creditHours = creditHours;
    }

    public Courses(){
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
