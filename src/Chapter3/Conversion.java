package Chapter3;

import java.util.Scanner;

public class Conversion{
   //main method with import java	
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      

      System.out.print("\"Enter\" ");
      System.out.print("a value for feet: ");
      double feet = input.nextDouble();

      double metre = 0.305 * feet;

      System.out.printf("%.2f feet is %.2f metres", feet,metre);

   }


}