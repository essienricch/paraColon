package MyPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentReport {
    static String [] studentName;
    static String [] subjectName;
    static int [][] studentScore;
    static int studentNumber;
    static int subjectTaken;

    static Scanner scanner = new Scanner(System.in);


            public static void setTheStudentName(){
                int number = 0;
                String name ="";
                        do {
                            System.out.println("How many student are in the class: ");

                            try {
                                number = scanner.nextInt();

                            } catch (InputMismatchException mismatchException) {
                                System.out.println("Enter a valid integer input " + mismatchException);
                            }if (number < 100 && number > 0){
                                break;
                            }
                        }while (scanner.hasNextInt());
                                studentNumber = number;
                                studentName = new String[studentNumber];
                        for (int i = 0, j = 1; i < studentName.length; i++, j++) {
                            System.out.println("Enter Natives " + j +" name: ");
                            scanner.nextLine();
                            while (scanner.nextLine().isEmpty()) {
                                System.out.println("Enter Natives " + j + " name: ");
                                name = scanner.nextLine();
                            }
                                studentName[i] = scanner.nextLine();
                            System.out.println(name +" entered in the program");
                            System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>> ");
                        }
                        System.out.println(" Saved Successfully ");
            }


            public static void setTheSubjectOffered(){
                    int number = 0;
                    String subject = "";
                                do {
                        System.out.println("How many subject does the students offer: ");

                        try {
                            number = scanner.nextInt();

                        } catch (InputMismatchException mismatchException) {
                            System.out.println("Enter a valid integer input " + mismatchException);
                        }if (number < 100 && number > 0){
                            break;
                        }
                    }while (scanner.hasNextInt());
            subjectTaken = number;
            subjectName = new String[subjectTaken];
            for (int i = 0, j = 1; i < subjectName.length; i++, j++) {
                System.out.println("Enter subject  " + j +" name: ");
                scanner.nextLine();
                while (scanner.nextLine().isEmpty()) {
                    System.out.println("Enter Subject " + j + " name: ");
                    subject = scanner.nextLine();
                }
                subjectName[i] = scanner.nextLine();
                System.out.println(subject +" entered in the program");
                System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>> ");
            }
            System.out.println(" Saved Successfully ");
        }


            public static int getStudentNumber() {
                return studentNumber;
            }

            public static int getSubjectTaken() {
                return subjectTaken;
            }



        public static int [][] recordScores(){
                int score = 0;
           int studentScoreCount = 0;
            int [][] studentScore = new int[getStudentNumber()][getSubjectTaken()];
            for (int row = 0; row < studentScore.length; row++) {
                System.out.println("Entering score of "+ studentName[row]);
                for (int column = 0; column < studentScore[row].length; column++) {
                    do {
                        System.out.println("Enter score  for " + subjectName[column]  + ": ");
                        try {
                            score = scanner.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Input a valid score" + e);
                        }
                    }while ((score < 0));
                    studentScore[row][column] = score;
                    System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>> ");
                }
            }System.out.println(" Saved Successfully ");
            return recordScores();
        }

    }

