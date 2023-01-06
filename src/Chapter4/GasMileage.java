package MyPractice;
import java.util.Scanner;

public class GasMileage {

    static int count = 0;
    static int total = 0;
   static int miles = 0;
   static int gallons = 0;
   static int milesPerGallons = 0;
   static int combinedMilesPerGallons = 0;
   static int milesIntake = 0;
   static int gallonTaken = 0;

    public static void milesPerGallon() {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the miles, enter -1 to exit: ");
            miles = input.nextInt();
            if (miles != -1) {
                milesIntake += miles;
            }else {
                break;
            }
            System.out.println("Enter the gallons used, enter -1 to exit: ");
            gallons = input.nextInt();
            if (gallons != -1){
            gallonTaken += gallons;
            }else {
                break;
            }
            count++;
        }
        while (miles != -1);
            total += count;

           if (miles == -1 && gallons == -1) {
                   System.out.println("No trips covered");
           }
            if (miles == -1 || gallons == -1) {

                System.out.println("Trips covered: " + count);
                System.out.println("number of Miles driven: " + milesIntake);
                System.out.println("gallon used: " + gallonTaken);

            } if (milesIntake  > 0 && gallonTaken > 0){
                milesPerGallons = milesIntake / gallonTaken;
                System.out.println("miles per gallon: " + milesPerGallons);
                System.out.println();
                System.out.println("The average distance covered: " + (milesIntake/milesPerGallons)+"metres");
            }
    }

    public static double totalAverage(int miles, int gallons, int trips){
        total = miles / gallons;
        return (double) total / trips;
    }
}


