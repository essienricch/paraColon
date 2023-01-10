package Chapter10.studentGrading;

public class GraduateStudent extends Student{


    public String computeCourseGrade(){
        int total = 0;
        for (int i = 0; i < Num_Of_Test; i++) {
            total += testScores[i];
        }
        if (total/Num_Of_Test >= 80){
            setCourseGrade("Pass");
            return "Pass";
        }else return "Fail";
    }


}
