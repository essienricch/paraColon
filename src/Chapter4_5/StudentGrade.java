package Chapter4_5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = new String[5];
        String[] grade = new String[5];

        for (int count=0; count < grade.length;count++){
            System.out.println("Enter a student name: ");
            name[count]= input.nextLine();

            System.out.println(" Enter a student Grade: ");
            grade[count]= input.nextLine();
        }
        System.out.printf("%n%s%20s%n","Student","Grade");

        for (int count = 0; count < grade.length; count++){
            System.out.printf("%s%20s%n",name[count],grade[count]);
        }
    }
}


















//
//        String[] name = new String[5];
//
//        String[] grade = new String[5];
//
//        for (int counter = 0; counter < grade.length; counter++) {
//            System.out.println("Enter student name: ");
//            name[counter] = input.nextLine();
//
//            System.out.println("Enter grade: ");
//            grade[counter] = input.nextLine();
//        }
//
//        System.out.printf("%20s%10s%n", "NAME", "GRADE");
//
//        for (int counter = 0; counter < grade.length; counter++) {
//            System.out.printf("%20s%10s%n", name[counter], grade[counter]);
//        }
//    }
//}
