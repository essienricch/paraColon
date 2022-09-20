package previousProj;

import java.util.Scanner;

public class Minutes{
 
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number of Minutes: ");
   int minutes = input.nextInt();

   int years = minutes/(60 * 24 * 365);
   int days = minutes % (60 * 24 * 365) / (60 * 24);
    

   System.out.printf("%s is approximately %s years and %s days", minutes,years,days);
   
   }
}