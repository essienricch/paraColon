package Chapter3.FoodCanteen;

import java.util.Scanner;


class FoodCanteenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FoodCanteen purchaseReceipt = new FoodCanteen("Mmandu Calabar Kitchen",50_000.00);

        System.out.printf("Restaurant: %s%n",purchaseReceipt.getCanteenName());
        purchaseReceipt.setPrice();

        System.out.println();

        System.out.println("Balance after transaction: "+purchaseReceipt.getBalance());


    }

}