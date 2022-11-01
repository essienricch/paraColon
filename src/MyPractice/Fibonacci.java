package MyPractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int temp =0;
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to find its fibonacci: ");
        int num = scanner.nextInt();
        for (int i = 2; i < num; i+=1){
            //temp += i;
           temp = b;
           b += a;
            a  = temp;

           // System.out.println();
            System.out.println(b);
        }

    }
}
