package snacks.studentScore;

import java.util.List;

public class SemicolonScoreBoard {

    private List <Student> nativeList;

    private void upHeader(){
        System.out.println("========================================================");
        System.out.printf("%n%s%25s%10s%10s%n","STUDENT","SUBJECT 1","SUBJECT 2","SUBJECT 3");
        System.out.println("=======================================================");
    }
    private void downHeader(){
        System.out.println("============================================");
        System.out.println();
        System.out.println("=============================================");
    }

    public void addNatives(Student student){
        nativeList.add(student);
    }

    public List<Student> getNativeList() {
        return nativeList;
    }

    public void studentSubjectTemplate(Student student, String subject){
        for (Student student1: nativeList){
            if (student1.equals(student)){
                System.out.printf("%s%10s%n%s%10s%n%s%10d%n","STUDENT NAME --> ",student1.getNameOfStudent(),"SUBJECT --> ",student1.getSubject(subject),"SCORE --> ",student1.getSubject(subject).getScores());
            }
        }
    }

    public void displayResult(){
        upHeader();
        for (Student student : nativeList) {
            System.out.printf("%n%s%25d%10d%10d", student.getNameOfStudent(), student.getSubject().getScores(), student.getSubject().getScores(), student.getSubject().getScores());
        }
        System.out.println();
        downHeader();
    }

    public void scoreStudent()
}
