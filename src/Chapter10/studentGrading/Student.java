package Chapter10.studentGrading;

public class Student {

    protected static final int Num_Of_Test = 3;
    protected String studentName;
    protected int [] testScores;
    protected String courseGrade;

    public Student(String studentName) {
        this.studentName = studentName;
        this.testScores = new int[Num_Of_Test];
        this.courseGrade = "No Grade";
    }

    public Student(){
        this("No name");
    }

    //abstract public void computeCourseGrade();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTestScores(int test) {
        return testScores[test-1];
    }

    public void setTestScores(int testScores, int test) {
        this.testScores[test-1] = testScores;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }
}
