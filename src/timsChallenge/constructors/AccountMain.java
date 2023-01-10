package timsChallenge.constructors;

import java.util.Scanner;

public class AccountMain {

   static Accounts richAccounts = new Accounts("jerry","2550796","12345");
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            menu();
    }
    public static void registerAccount(){
        System.out.println("Enter name of account: ");
        String name = input.next();
        input.nextLine();
        richAccounts.setName(name);
        //handle break of nextLine.

        System.out.println();

        System.out.println("Enter your preferred account number: ");
        String azaNumb = input.nextLine();
        richAccounts.setAccountNumber(azaNumb);
//        input.nextLine();

        System.out.println();

        System.out.println("Enter email address: ");
        String email = input.nextLine();
        richAccounts.setEmail(email);
       // input.nextLine();

        System.out.println();

        System.out.println("Enter your phone number: ");
        String phoneNumb = input.nextLine();
        richAccounts.setPhoneNumber(phoneNumb);

        //input.nextLine();
        System.out.println();

        acctSetupMenu();

    }

    public static void viewAccountBalance(){
        System.out.println(richAccounts.getName() + " Account balance: "+ richAccounts.getBalance());
        acctSetupMenu();
    }

    public static void makeDeposit(){
        System.out.println("How much would you love to deposit: ");
        double amount = input.nextDouble();
        richAccounts.depositFunds(amount);
        System.out.println("You deposited a "+ amount + " into " + richAccounts.getName() +" accounts");
        acctSetupMenu();
    }

    public static void withdrawFunds(){
        System.out.println("How much would you like to withdraw: ");
        double withdrawAmt = 0;
        try {
            withdrawAmt = input.nextDouble();
            richAccounts.withdrawFunds(withdrawAmt);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        acctSetupMenu();
    }

    public static void menu(){
        System.out.println("Good day sir/ma, Welcome to Bank Of America.");
        System.out.println("""
                Press 1. to Set-up an account
                Press 2. to Exit the app.
                """);
        int response = input.nextInt();
        acctSetupMenu(response);
    }

    public static void acctSetupMenu(int answer){
        if (answer == 1){
            System.out.println("""
                    Press 1. To register an account.
                    Press 2. To view your account balance.
                    Press 3. To make a Deposit.
                    Press 4. To Withdraw funds.
                    Press 5. To go back to main menu
                    """);
            int acctReply = input.nextInt();
            switch (acctReply) {
                case 1 -> registerAccount();
                case 2 -> viewAccountBalance();
                case 3 -> makeDeposit();
                case 4 -> withdrawFunds();
                default -> menu();
            }
        }else {
            System.out.println("Thank you for visiting our bank application.");
        }
    }

    public static void acctSetupMenu(){
        System.out.println();
                System.out.println("""
                    Press 1. To view account profile.
                    Press 2. To view your account balance.
                    Press 3. To make a Deposit.
                    Press 4. To Withdraw funds.
                    Press 5. To go back to main menu
                    """);
                int acctReply = input.nextInt();
                switch (acctReply) {
                    case 1 -> viewProfile();
                    case 2 -> viewAccountBalance();
                    case 3 -> makeDeposit();
                    case 4 -> withdrawFunds();
                    default -> menu();
                }
    }

    private static void viewProfile(){
        System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%n","==========================================",
                "Account Name:  ",richAccounts.getName(),"Account Number:  ",richAccounts.getAccountNumber(),"Email-Address: ",richAccounts.getEmail(),"Phone-Number: ", richAccounts.getPhoneNumber(),"=============================================");
        acctSetupMenu();
    }
}


