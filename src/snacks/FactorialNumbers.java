package snacks;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        long factorial = 1;
        System.out.println("Enter your factorial: ");
        long sum = input.nextLong();
        while (count <= sum){
            factorial = factorial * count;
            count++;
        }
        System.out.printf("Your factorial %d  is: %d  ", sum, factorial);

        /*int count = 0 ;
        int number = 0;
        int fact = 1;
        System.out.println(" Bro, please enter a number: ");
        number= input.nextInt();

        for (count=1;count<=number;count++){
           fact =fact * count;
            System.out.println(fact);

        }*/
    }
}
