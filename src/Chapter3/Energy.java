package previousProj;

import java.util.Scanner;

public class Energy {
    
   public static void main(String[] args){
 
      Scanner input = new Scanner(System.in);


      System.out.print("Enter the amount of water in kilograms: ");
      double M = input.nextDouble();

      System.out.print("Enter the initial temperature: ");
      double tini = input.nextDouble();

      System.out.print("Enter the final temperature: ");
      double tfin = input.nextDouble();

      double minus = tfin - tini;

      double energy = M * minus * 4184;

      System.out.println("the energy needed is " + energy + " joules");

   }
}