package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    static Scanner input = new Scanner(System.in);
    static int accountNumber;
    static int items;
    static int credits;
    static int balance;
    public static void addAcctNumber(int accountNumber){
        CreditLimit.accountNumber = accountNumber;
       // System.out.println("Enter Client's Account Number: ");
    }

    public static int newbalances(int balance, int items, int credits) {
        int newbalance = (balance + items) - credits;
        if (newbalance > credits){
            System.out.println("Credit Limit Exceeded");
        }else{
        System.out.println("Credit Limit Not Exceeded");
        }
        return newbalance;
    }

    public static void mainBalance(int clientBalance) {
        CreditLimit.balance = clientBalance;
    }

    public static void itemCharges(int clientCharges) {
       items = clientCharges;
    }

    public static void clientCredit(int usercredits) {
        credits = usercredits;
    }
}
