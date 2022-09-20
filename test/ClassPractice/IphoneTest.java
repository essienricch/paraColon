package ClassPractice;

import java.util.Scanner;

class IphoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Iphone.setColor("Blue");Iphone.setPrice(500_000);
        System.out.printf("THE %s iphone12 costs: %d", Iphone.getColor(), Iphone.getPrice());

        Iphone.setColor("Black");Iphone.setPrice(1_000_000);
        System.out.printf("%nTHE %s iphone14 costs: %d", Iphone.getColor(), Iphone.getPrice());

    }

}