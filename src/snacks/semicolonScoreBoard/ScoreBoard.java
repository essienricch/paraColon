package snacks.semicolonScoreBoard;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    private List <Natives> nativeList = new ArrayList<>();


    private void upHeader(){
        System.out.println("========================================================");
        System.out.printf("%s%20s%15s%15s%n","STUDENT","SUBJECT-1","SUBJECT-2","SUBJECT-3");
        System.out.println("==========================================================");
    }
    private void downHeader(){
        System.out.println("============================================================");
        System.out.println("=============================================================");
    }

    public void addNatives(Natives natives){
        nativeList.add(natives);
    }

    public List<Natives> getNativeList() {
        return nativeList;
    }

    public void studentSubjectTemplate(String studentName, String subject){
        for (Natives natives1 : nativeList){
            if (natives1.getNameOfStudent().equals(studentName)){
                System.out.printf("%s%10s%n%s%10s%n%s%10d%n","STUDENT NAME --> ", natives1.getNameOfStudent(),"SUBJECT --> ", natives1.getSubject(subject),"SCORE --> ", natives1.getSubject(subject));
            }else throw new IllegalArgumentException("such student not found");
        }downHeader();
    }

    public void displayResult(){
        upHeader();
        for (Natives natives : nativeList) {
            System.out.printf("%n%s%20d%15d%15d", natives.getNameOfStudent(), natives.getSubject().getScores(), natives.getSubject().getScores(), natives.getSubject().getScores());
        }
        System.out.println();
        downHeader();
    }

//    public void giveStudentScore(String student, String subject, int score){
//        for (Natives natives1 : nativeList){
//            if (natives1.getNameOfStudent().equals(student)){
//               natives1.getSubject(subject).setScoreSheet(score);
//            }else throw new IllegalArgumentException("student not found");
//        }
//    }

}
