package MyPractice;

import java.util.Scanner;

public class ReverseValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int revValue = 0;
        System.out.println("Enter a value to get the reverse: ");
        int num = scanner.nextInt();
        System.out.println();
        while (num > 0){
            int rem = num % 10;
            revValue = revValue * 10 + rem;
            num /= 10;
        }
        System.out.println("Your reverse value is: "+revValue);

    }
}
