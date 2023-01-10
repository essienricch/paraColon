package Chapter10.studentGrading;

public class NonRegularStudent extends Student{

    public void computeCourseGrade(){
        int total = 0;
        for (int i = 0; i < Num_Of_Test; i++) {
            total += testScores[i];
        }if (total/Num_Of_Test >= 50){
            System.out.println("Pass");
        }
        System.out.println(" You are a Failure...");

    }
}
