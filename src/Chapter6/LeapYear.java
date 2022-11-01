package Chapter6;

import java.util.Scanner;

public class LeapYear {
  static Scanner scanner = new Scanner(System.in);

  private static int year;

    public static void isLeapYear(){
        System.out.println("Enter a year to test for it's leap year: ");
        year = scanner.nextInt();
        if (year % 400 == 0){
            System.out.println("Your input is a leap year. ");
        } else if (year % 4 == 0) {
            System.out.println("Your input is a leap year. ");
        }else {
            System.out.println("Sorry!!! Your input is not a leap year");
        }
    }
}
