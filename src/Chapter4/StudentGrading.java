package Chapter4;

import java.util.Scanner;

public class StudentGrading {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private double score;

   /* public StudentGrading(String name, double score){
        this.name = name;
        if (score > 0 && score <= 100){
            this.score = score;
        }
   }*/

    public void setName(){
        System.out.print("Enter Natives name: ");
        String name = scanner.nextLine();
        this.name=name;
        System.out.println("Natives name: "+name);
    }

    public void setScore(){
        System.out.print("Enter Natives score: ");
        double score = scanner.nextDouble();
        if (score > 0 && score <= 100){
            this.score= score;
            System.out.println("Natives score: "+score);
        }
    }


    public void getGrade(){
        String grade = " ";
        if (score >= 90){
            grade = "Passed with an 'A'";
        } else if (score >= 80) {
            grade = "Passed with a 'B'";
        } else if (score >= 70) {
            grade = "Passed with a 'C'";
        }else if (score >= 60){
            grade = "Passed with a 'D'";
        }else{
            grade = "Passed with an 'F'";
        }
        System.out.println("You "+grade+" grade.");
    }
}
