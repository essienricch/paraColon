package Chapter4.rightAngleTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Right_Angled_Triangle rightAngledTriangle =new Right_Angled_Triangle(6);
        rightAngledTriangle.drawRightAngleWithAsterisks();
        System.out.println("Enter a baseLength: ");
        int length = scanner.nextInt();
        rightAngledTriangle.drawRightAngleWithAsterisks(length);
    }

}
