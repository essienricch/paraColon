package Chapter4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factors = 0;
        System.out.print("Enter a number to validate \n if it is a prime number: ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++){
            int remainder = number % i;
            if (remainder == 0){
                factors++;
            }
        }
        if (factors > 2){
            System.out.println("This is not a Prime Number");
        }else
            System.out.println("This is a Prime Number");
    }
}
