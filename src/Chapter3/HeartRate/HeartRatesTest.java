package Chapter3.HeartRate;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HeartRates heartRates = new HeartRates("William","Akpan","October",28,1993);

        System.out.println("My name is " + heartRates.getFirstName()+" " + heartRates.getLastName());
        System.out.println("Born on "+heartRates.getDay()+" "+heartRates.getMonth()+" "+heartRates.getYear());
        heartRates.getAge();
        System.out.println();
        heartRates.heartRate();
        System.out.println("Your Target Heart Rate: "+heartRates.maxMinTargetRate());


    }
}
