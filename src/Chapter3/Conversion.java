package previousProj;

import java.util.Scanner;

public class Conversion{
   //main method with import java	
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      

      System.out.print("\"Enter\" ");
      System.out.print("a value for feet: ");

      double feet = input.nextDouble();

      double metre = feet * 0.305;

      System.out.printf("%.1f feet is %.4f metres", feet,metre);
     

     
   //main method end
   }


}