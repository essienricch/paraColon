package Chapter3.Account;

import java.util.Scanner;

public class Account {

        private static String name;

         private static double balance;

         private String name1;

         public Account(String name, double balance){
             Account.name = name;
             Account.balance = balance;
         }


    static Scanner input = new Scanner(System.in);

   public static void setName(String name){
       Account.name = name;
   }

   public static String getName(){
       return name;
   }
   public static double deposit(){
       System.out.println("Enter deposit amount: ");
       double amount = input.nextDouble();
       if (amount > 0.0){
          Account.balance = balance + amount ;
       }
       return amount;
   }

   public static double withdraw() {
       double amount;
       int count=0;
       int total=0;
       do {
           System.out.println("Enter withdrawal amount: ");
           amount = input.nextDouble();

           if (amount > 0.0 && amount <= balance ) {
               Account.balance = balance - amount;
               break;
           }
           else if (amount > balance) {
               System.out.println("\"Withdrawal amount exceeds account balance\"");
               count++;
           }
       }while (count > 0);{
          total  += count;
       }
       return amount;
   }
    public static double getBalance(){
        return balance;
    }

    public static void displayAccount(Account account){
        System.out.println(name +" " + balance+"$");
        //System.out.println(balance);

    }
}
