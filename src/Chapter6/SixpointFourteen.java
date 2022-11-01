package Chapter6;

import java.util.Scanner;

public class SixpointFourteen {
    public static void main(String[] args) {
       int y = myCeil(17.5);
       int x = myFloor(5.5);
        System.out.println(y);
        System.out.println(x);
    }
    public static int myFloor(double num) {
        if (num % 1 == 0){
            return (int)num;
        } else if (num % 1 != 0) {
            return (int) num;
        }
        return (int)num;
    }
    public static int myCeil(double num){
        if (num % 1 == 0){
            return (int) num;
        } else if (num % 1 != 0) {
            return (int) num + 1;
        }
        return (int) num;
    }
}
