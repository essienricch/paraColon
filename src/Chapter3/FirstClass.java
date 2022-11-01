package Chapter3;

import java.util.Scanner;

public class FirstClass{
   //main method with import java	
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      double feet;
      double metre;

      System.out.print("\"Enter\" ");
      System.out.print("a value for feet: ");

      feet = input.nextDouble();

      metre = feet * 0.305;

      System.out.printf("%.1f feet is %.4f metres", feet,metre);
     

     
   //main method end
   }


}