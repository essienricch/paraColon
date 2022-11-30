package MyPractice;

import java.util.Scanner;

public class MyersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        MyerBriggsResult.setUserName(name);
        MyerBriggsResult.switchExtIntrovert();
        MyerBriggsResult.personExtInt();
        MyerBriggsResult.switchSenseIntuitive();
        MyerBriggsResult.personSenseNtuitive();
        MyerBriggsResult.switchThinkFeels();
        MyerBriggsResult.personThinkFeel();
        MyerBriggsResult.switchJudgePercieve();
        MyerBriggsResult.personJudgePercieve();
        MyerBriggsResult.result();
        MyerBriggsResult.personality();
    }
}
