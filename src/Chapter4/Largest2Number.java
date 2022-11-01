package Chapter4;

import java.util.Scanner;

public class Largest2Number {
    static Scanner scanner = new Scanner(System.in);

    public static void largeUnit() {
        int count = 0;
        int largest;
        int largest2;
        int temp;
//        if (num2 > largest){
//            largest = num2
//        } else if (num3 > largest) {
//            largest = num3;
//        } else if (num4 > largest) {
//            largest = num4;
//        }else largest = num5;

        //return largest;
        System.out.print("Enter the unit sold to determine the 2 largest value: ");
        int number = scanner.nextInt();
        largest = number;
        largest2 = number;
        while (count < 9) {
            System.out.print("Enter unit sold to determine the 2 largest value: ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (largest > largest2){
                temp = largest;
                largest = largest2;
                largest2 = temp;
                }

            count++;
        }
        System.out.println(" The 2 largest value in your sold unit is: " + largest + ", " + largest2);

    }

    public static void main(String[] args){
        largeUnit();
    }
}
