package snacks.semicolonScoreBoard;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


       //todo: Create A ScoreBoard to Add Natives To The List-->
        ScoreBoard scoreBoard = new ScoreBoard();

        //todo: To score Natives/Students-->
        //scoreStudent(scoreBoard);

        //todo: To Display Result of All Natives-->
       // scoreBoard.displayResult();

        //Todo: Display for just A Particular Student-->

        Natives natives = new Natives("Bola");
        natives.courseRegistration("Java");
        natives.courseRegistration("python");
        natives.courseRegistration("DB");
        scoreBoard.addNatives(natives);

        Natives natives1 = new Natives("Danny");
        natives1.courseRegistration("python");
        natives1.courseRegistration("javascript");
        natives1.courseRegistration("Kotlin");
        scoreBoard.addNatives(natives1);

        try {
            scoreBoard.studentSubjectTemplate("Bola","Java");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void scoreStudent(ScoreBoard scoreBoard){
        Natives natives = new Natives("Bola");
        natives.courseRegistration("Java");
        natives.courseRegistration("python");
        natives.courseRegistration("DB");
        scoreBoard.addNatives(natives);

        Natives natives1 = new Natives("Danny");
        natives1.courseRegistration("python");
        natives1.courseRegistration("javascript");
        natives1.courseRegistration("Kotlin");
        scoreBoard.addNatives(natives1);

        Natives natives2 = new Natives("Cosmos");
        natives2.courseRegistration("javascript");
        natives2.courseRegistration("java");
        natives2.courseRegistration("python");
        scoreBoard.addNatives(natives2);

        System.out.println(scoreBoard.getNativeList().size());
        System.out.println(scoreBoard.getNativeList().get(0).count());


        for (int i = 0; i < scoreBoard.getNativeList().size(); i++) {
            int counter = scoreBoard.getNativeList().get(i).count();
            while (counter != 0){
                System.out.println("Enter " + scoreBoard.getNativeList().get(i).getSubject(counter) + " score for " + scoreBoard.getNativeList().get(i).getNameOfStudent() + ": ");
                int score = scanner.nextInt();
                scoreBoard.getNativeList().get(i).getSubject().setScoreSheet(score);
                counter--;
            }
        }
    }
}
