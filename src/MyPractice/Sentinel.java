package MyPractice;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        //todo a small jumia script that collects 10 valid scores and outputs sum
        Scanner input = new Scanner(System.in);
        int scoreCount= 0;
        int score;
        int total = 0;
        while (scoreCount != 10){
            System.out.print("Enter a valid (1-100) score"+(scoreCount+1)+ ":");
            score = input.nextInt();


            if (score >= 0 && score <= 100){
                total += score;
                scoreCount++;
            }
        }
        System.out.println();
        System.out.println("Total score collected: "+total);
        System.out.println("Average scores: "+(total/scoreCount));
    }
}
