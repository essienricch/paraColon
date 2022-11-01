package Chapter3;

import java.util.Scanner;

public class Acceleration{

   public static void main(String[] args){

     Scanner input = new Scanner(System.in);

     System.out.print("Enter the starting velocity(m/s): ");     
     int v0 = input.nextInt();

     System.out.print("Enter the ending velocity(m/s): ");
     int v1 = input.nextInt();

     System.out.print("Enter the time span(s): ");
     int t = input.nextInt();

     //double A = (v1-v0)/t;
     System.out.println("Your average acceleration: "+ (v1-v0)/t);

   }

}