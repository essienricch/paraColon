package Chapter7;

import java.util.*;

public class MallMart {

    static Scanner scanner = new Scanner(System.in);
    static Date date = new Date();


    static String clientName;
    static int clientNumber;
    static String cashier;
    static ArrayList<Integer> unit = new ArrayList<>();
    static ArrayList<Double> pricePerUnit = new ArrayList<>();
    static ArrayList<String> items = new ArrayList<>();
    static double total;
    static double subTotal;
    static double customerBonus;

    static int bonusCount = 0;


    public static void header() {
        //System.out.println("|<----------------------------->|");
        System.out.print("""
                Welcome to DO-RIME Mall Mart (God is the Greatest).\s
                Contact Number: +2349040002003\s
                E-mail: info@godabegmallmart.com.\s
                Address: 7, Show Dem' Camp Republic.""".indent(1));
        //System.out.print("|<------------------------------->|");
    }


    public static void cartOrder() {
        int itemList = 0;
        String ans;

        System.out.println();
        System.out.print("Welcome, 'Press 1 to proceed to get a shopping cart or 'ANY-OTHER' key to Exit this program: ");
        int conExit = scanner.nextInt();

        if (conExit == 1) {

            System.out.println("\n------- ORDER CART --------- ");

            System.out.print("\nEnter Customer Name: ");
            clientName = scanner.next();


            String answer = " ";

            do {

                itemList++;


                System.out.print("Enter Name of product: ");
                items.add(scanner.next());

                System.out.print("Enter Price of product: ");
                pricePerUnit.add(scanner.nextDouble());

                System.out.print("Enter Unit(s) of product: ");
                unit.add(scanner.nextInt());


                System.out.print("Would you like to add more Item? ");
                answer = scanner.next();
                ans = answer.toUpperCase();

            } while (ans.equals("YES"));

            System.out.print("Sales Attendant: ");
            cashier = scanner.next();
            System.out.println();


            System.out.print("Is this your first time of shopping with us? ");
            String firstTime = scanner.next();
            String fTime = firstTime.toUpperCase();

            if (!fTime.equals("YES")) {

                System.out.print("Kindly input your ID number to call up your details: ");
                clientNumber = scanner.nextInt();
                int pointUsed = 1;
                bonusCount += pointUsed;


            } else {

                System.out.println();
                System.out.print("Would you love us to register you as a new customer? \n'You Earn Points for every purchase you make in our store' : ");
                String newCust = scanner.next();
                String updateNewCust = newCust.toUpperCase();

                if (updateNewCust.equals("YES")) {

                    System.out.println();
                    System.out.print("Enter a number to register: ");
                    clientNumber = scanner.nextInt();

                }


            }



            if (itemList > 2) {

                System.out.printf("""
                         |<--------------------------------->|
                        %n%s%5s%n%s%5s%n%n%d%15s%15s%25s
                        """, "Items Billed To: ", clientName.toUpperCase(), "Sales Attendant: ", cashier.toUpperCase(), itemList, "Item" + "(s)", "Quantity" + "(s)", "Price per Unit(#)");
            } else {
                System.out.printf("""
                        |<--------------------------------->|
                        %s%5s%n%s%5s%n%n%d%15s%15s%25s
                        """, "Items Billed To: ", clientName.toUpperCase(), "Sales Attendant: ", cashier.toUpperCase(), itemList, "Item", "Quantity", "Price per Unit");
            }


            int count;
            for (count = 0; count < items.size(); count++) {
                subTotal += unit.get(count) * pricePerUnit.get(count);
                System.out.printf("""
                        |%15s%15s%20s     |
                        """, items.get(count).toUpperCase(), unit.get(count), pricePerUnit.get(count));
            }


            double vat = 0.075 * subTotal;
            if (bonusCount > 0) {
                total = (subTotal + vat) - (subTotal * 0.020);
                System.out.printf(" %n%35s%14.2f%n%35s%14.2f%n%35s%14s%14.2f", "Subtotal", subTotal, "V.A.T", vat, "Loyalty Point", "--", (subTotal + vat));

            } else {

                total = subTotal + vat;
                System.out.printf(" %n%35s%14.2f%n%35s%14.2f", "Sub-total", subTotal, "V.A.T", vat);
            }
            System.out.printf("%n%53s%n", "-----------");
            System.out.printf("%35s:%14.2f%n", "Total", total);
            System.out.printf("%53s%n", "-----------");

        }else
            {
                bonusCount -= 1;
            }


    }




    public static void paymentReceipt() {

        if (bonusCount > 0) {

            System.out.println();
            System.out.print("Would you love to make payment? ");
            String response = scanner.next();
            String resp = response.toUpperCase();

            if (resp.equals("YES")) {
                System.out.print("What is your Mode of Payment (POS, CASH, TRANSFER, BTC): ");
                String pay = scanner.next();
                String pay2 = "";
                pay2 = pay.toUpperCase();


                if (!pay2.isEmpty()) {
                    System.out.println();
                    System.out.println("|<----------------------------------->|");
                    System.out.printf("%s:%10s%n%s:%10d%n%s%10s%n%s:%12.2f%n%s:%10s", "Customer Name", clientName.toUpperCase(), "Customer ID", clientNumber, "MODE OF PAYMENT: ", pay.toUpperCase(), "Paid Amount After Loyalty Discount", total, "Sales Attendant", cashier.toUpperCase());
                    System.out.println();
                    System.out.printf("%n%s%n", date);
                    System.out.printf("%s%5s%5.2f%n%s%n", "Loyalty-Point Earned After Purchase: ", "#",(total * 0.020), "Shop More to Keep Earning More Loyalty Point");
                    System.out.println("|<----------------------------------->|");
                    System.out.println("Thank you for shopping with us!!! \n We hoping to see you soon");
                } else

                    System.out.println("Unable to complete this Transaction\n Please Try Again");

            }else{

                    System.out.println("No payment Made");
                    System.out.println("Transaction Not Completed");
                }

        }else if (bonusCount == 0) {
                System.out.println();
                System.out.print("Would you love to make payment? ");
                String response = scanner.next();
                String resp = response.toUpperCase();

                if (resp.equals("YES")) {
                    System.out.print("What is your Mode of Payment (POS, CASH, TRANSFER, BTC): ");
                    String pay = scanner.next();
                    String pay2 = pay.toUpperCase();

                    if (!pay2.isEmpty()) {
                        System.out.println();
                        System.out.println("|<----------------------------------->|");
                        System.out.printf("%s:%10s%n%s:%10d%n%s:%10s%s%s:%10.2f%n%s:%10s", "Customer Name", clientName.toUpperCase(), "Customer(ID number)", clientNumber, "MODE OF PAYMENT ", pay.toUpperCase(), "\n","AMOUNT PAID", total, "Sales Attendant", cashier.toUpperCase());
                        System.out.println();
                        System.out.printf("%n%s%n", date);
                        System.out.printf("%s%s%5.2f%n%s%n", "Loyalty-Point Earned After Purchase: ", "#",(total * 0.020), "Shop More to Earn More Loyalty Point");
                        System.out.println("|<----------------------------------->|");
                        System.out.println("Thank you for shopping with us!!! \n We hoping to see you soon");
                    } else

                        System.out.println("Unable to complete this Transaction\n Please Try Again");

                }
                else{
                    System.out.println("No payment Made");
                    System.out.println("Transaction Incomplete");
                    }

        } else
            System.out.println("End of Program" );

    }

}
