package previousProj;

import java.util.Scanner;

public class RichyAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight of water in kg: ");
        double waterAmount = scanner.nextDouble();


        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();


        System.out.println("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();


        double energy = waterAmount * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}
