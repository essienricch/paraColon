package snacks;

import java.util.Scanner;

public class FactorialNumbers {


   private static int count;
    private static int factorial;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a value to check for the factorial conversion: ");
        int sum = input.nextInt();
        System.out.println("Count\tFactorial");
       for (count = 1; count <= sum; count++){
            factorial = count * sum;
            System.out.printf("%n%d%10d%n",count,factorial,"");
        }
        System.out.println();
        System.out.printf("Your factorial value of %d  is: %d  ",  sum, factorial);

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
