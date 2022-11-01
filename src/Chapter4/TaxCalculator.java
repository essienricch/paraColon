package Chapter4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TaxCalculator {

   static ArrayList <String> citizenName = new ArrayList<>();
   static ArrayList <Double> citizenWage = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
//    public static double taxcalculator(String citizensName, double citizensWage){
//        double yearlytax = 0.0;
//        if (citizensWage <= 30000.0){
//            yearlytax = (citizensWage * 15) / 100;
//            System.out.println(citizensName + " Your total tax for the year is: "+yearlytax);
//        } else if (citizensWage > 30000.0) {
//            yearlytax = (citizensWage * 20)/ 100;
//            System.out.println(citizensName + " Your total tax for the year is: "+yearlytax);
//        }return yearlytax;
//    }

    public static  void taxcalculator() {
        System.out.println("Essien Tax Calculator [R] \n (Your most accurate and Detailed Tax calculator) \n 'Press 1' to start/run this Application or 'Press 2' to Exit: ");
        int run = scanner.nextInt();
        if (run == 1) {
            String count = null;
            double yearlyTax = 0;
            String detail = " ";
            double earn;

            do {
                System.out.print("Enter name of the citizen: ");
                String name = scanner.next();
                citizenName.add(name);

                System.out.print("Enter the citizen yearly earning: ");
                earn = scanner.nextDouble();
                if (earn > 0) {
                    citizenWage.add(earn);
                } else {
                    System.out.println("Negative Input, Enter a valid amount ");
                    citizenWage.add(0.0);
                }

                System.out.println("Would you love to input more details (YES or NO) : ");
                detail = scanner.next();
                if (!Objects.equals(detail, "yes")) {
                    break;
                } else
                    count = detail.toUpperCase();

            } while (Objects.equals(count, "YES"));

                    System.out.println();
                    for (int i = 0; i < citizenWage.size(); i++) {
                        if (citizenWage.get(i) <= 30000.0) {
                            yearlyTax = citizenWage.get(i) * 0.15;
                            System.out.println(citizenName.get(i) + " Yearly Tax is: " + yearlyTax);

                        } else if (citizenWage.get(i) > 30000.0) {
                            yearlyTax = citizenWage.get(i) * 0.2;
                            System.out.println(citizenName.get(i) + " Yearly Tax is: " + yearlyTax);
                         }
                    }
        }else if (run == 2) {
                System.out.println("Good-Bye!!! \n Thank You for Visiting this Application...");
        }
    }




    public static void main(String[] args) {
        taxcalculator();
    }
}
