package ClassPractice;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int miles = 0;
        int gallons = 0;
        int milesPerGallons = 0;
        int count = 0;
        int combinedMilesPerGallons = 0;
        int milesIntake = 0;
        int gallonTaken = 0;
        Scanner input = new Scanner(System.in);

        while (miles >= 0 && gallons >= 0) {
            System.out.println("Enter the miles, enter -1 to exit: ");
             miles = input.nextInt();
            System.out.println("Enter the gallons used, enter -1 to exit: ");
             gallons = input.nextInt();

            if (gallons == -1 || miles == -1){
                break;
            }
            milesIntake = milesIntake + miles;
            gallonTaken = gallonTaken + gallons;
            milesPerGallons = milesIntake / gallonTaken;
            combinedMilesPerGallons = combinedMilesPerGallons + milesPerGallons;
            count++;
        }
        System.out.println("number of Miles driven: "+milesIntake);
        System.out.println("gallon used: "+gallonTaken);
        System.out.println("Combined MilesperGallon of all trips: "+(double)milesPerGallons);
        System.out.println("Average miles per gallons for all trips : "+combinedMilesPerGallons);
        System.out.println("The average: "+ (double)combinedMilesPerGallons/count);
    }


}


