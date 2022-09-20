package snacks;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = 0;
        int smallestNumber = 0;


        String answer = "";


        do {
            System.out.println("Enter a NUMBER: ");
            int number = input.nextInt();
            System.out.println("Enter a NUMBER: ");
            int number2 = input.nextInt();
            if (number > number2) {
                largestNumber = number;
            } else {
                largestNumber = number2;
            }
            if (number < number2) {
                smallestNumber = number;
            } else{
                smallestNumber = number2;
            }if (number==number2) {
                System.out.println("Both inputs are equal");

                System.out.println("Do you wish to continue (YES/NO): ");
                answer = input.next();

            }    }
        while (answer.equals("YES"));{
            System.out.println("Enter a NUMBER: ");
           int number = input.nextInt();
            System.out.println("Enter a NUMBER: ");
           int number2 = input.nextInt();
           if (number==number2){
               System.out.println("Both numbers are equal");
           }
           else
            if (number > number2) {
                largestNumber = number;
            } else {
                largestNumber = number2;
            }
            if (number < number2) {
                smallestNumber = number;
            } else {
                smallestNumber = number2;
            }

                System.out.printf("The smallest number is: %d%n", smallestNumber);
                System.out.printf("The largest number is: %d%n", largestNumber);


            }

//        while (number != -1 && number1 != -1) {
//            System.out.println("ENTER A NUMBER or press -1 to STOP: ");
//            number = input.nextInt();
//            total = total+number;
//
//            System.out.println("ENTER Another NUMBER or press 0 to STOP: ");
//            number1 = input.nextInt();
//            total1 = total1+number1;
//
//            int totals = total + total1;
//            int average = (total+total1)/counter;
//
//            ++counter;
//
//        if (counter != 0) {
//
//            System.out.println("Total of both numbers: " +totals);
//            System.out.println("Average of both numbers: " +average);
//            largestNumber = Math.max(number, number1);
//            smallestNumber = Math.min(number, number1);
//            System.out.println(largestNumber);
//            System.out.println(smallestNumber);
//        } else {
//            System.out.println("NO INPUT");
//        }
//        }


    }
}