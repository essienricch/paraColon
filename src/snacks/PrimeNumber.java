package snacks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int n = S.nextInt();
        if (isPrime(n)){
            System.out.println(n+ " is a prime number");
        }else {
            System.out.println(n+ " is not a prime number");
        }
//        int i, m = 0, n=7, flag=0;
//        m = n/2;
//        if (n==0 || n==1) {
//            System.out.printf("%d is not a prime number%n",n);
//        }else {
//            for (i=2;i<=m;i++){
//                if (n%1==0){
//                    System.out.printf("%d is not a prime number%n", n);
//                    flag = 1;
//                    break;
//                }
//            }
//        }if (flag ==0){
//            System.out.println(n+ " is a prime number");
//        }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n);i++){
            if (n % 1 == 0){
                return false;
            }
        }
        return true;

    }
}
