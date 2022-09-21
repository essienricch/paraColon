package Chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 4 integers and this application will output the max integer: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        int result = maximum(a,b,c,d);
        System.out.println("Maximum of the integers: " +result);
    }

    private static int maximum(int a, int b, int c, int d) {
        int maximum = a;

        if (b > maximum){
            maximum = b;
        }
        if (c > maximum){
            maximum = c;
        }
        if (d > maximum){
            maximum = d;
        }
        return maximum;
    }
}
