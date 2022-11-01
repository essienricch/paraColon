package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommissionCalculator {
    static double salesStaff;
    static String salesStaffName;
    static ArrayList <Double> value = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static double earnings(){
        int item = 0;
        int collect;
        int count = 0;
        System.out.print("Enter Sales Attendant Name: ");
        salesStaffName = scanner.next();

        while (true){
            System.out.println("Enter sales attendant item(s) sold or press -1 to exit: ");
            collect = scanner.nextInt();
            if (collect == -1)
                break;
            if (collect > 0 && collect <= 4){
                item = collect;
                ++count;
            switch (item) {
                case 1 -> {
                    value.add(239.99);
                    break;
                }
                case 2 -> {
                    value.add(129.75);
                    break;
                }
                case 3 -> {
                    value.add(99.95);
                    break;
                }
                case 4 -> {
                    value.add(350.89);
                    break;
                }
                }
            }
        }
        for (Double aDouble : value) {
            double bonus = aDouble * 0.09;
            salesStaff += bonus;
        } double wage = salesStaff + 200;
        System.out.printf("%s%s%d%s%s%s%5.2f%n", salesStaffName.toUpperCase(), " sold " , count, " item(s) and ", salesStaffName, "'s new balance is  ",wage);
        return wage;
    }

    public static void main(String[] args) {
        earnings();

    }


}
