package Chapter10.studentGrading;

public class Main {
    public static void main(String[] args) {
        Student semicolon = new UndergraduateStudent();
        semicolon.setStudentName("Richard");
        semicolon.setTestScores(90,1);
        semicolon.setTestScores(55,2);
        semicolon.setTestScores(65,3);

        semicolon.setCourseGrade(((UndergraduateStudent)semicolon).computeCourseGrade());
        System.out.println(semicolon.getStudentName() + " Scored "+ semicolon.getTestScores(1) + " in the 1st Test and scored " );
        System.out.println(semicolon.getStudentName() + " Scored "+ semicolon.getTestScores(2) + " in the 2nd Test and scored " );
        System.out.println(semicolon.getStudentName() + " Scored "+ semicolon.getTestScores(3) + " in the 3rd Test and scored " );

        System.out.println();
        System.out.println(semicolon.getStudentName() + " Scored a total of "+ (semicolon.getTestScores(1) + semicolon.getTestScores(2) + semicolon.getTestScores(3)) + " With a " + semicolon.getCourseGrade() + " Grade.");

        System.out.println("The total number of Undergraduate is "+studentRota());
    }

    public static int studentRota(){
        Student [] studentRooster = new Student[15];
        int undergraduate = 0;
        int graduate = 0;
        for (int i = 0; i < studentRooster.length; i++) {
            studentRooster[i] = typeOfStudent(i);
        }
        for (Student student : studentRooster) {
            if (student instanceof UndergraduateStudent) {
                undergraduate++;
            }else graduate++;
        }return 0;
    }

    public static Student typeOfStudent(int number){
        if (number % 2 == 1){
            return new GraduateStudent();
        }else if (number % 2 == 0){
            return new UndergraduateStudent();
        }else return new NonRegularStudent();
    }
}
