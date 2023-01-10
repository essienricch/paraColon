package Chapter3.HealthProfile;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile("Daniel","Essien","Male",04,"July",2002,1.20,45.3);
        System.out.println("Welcome to CypherX Medical Health Calculator");
        System.out.println();
        System.out.println("CLIENT PROFILE: ");
        System.out.println(healthProfile.getFirstName()+" "+healthProfile.getLastName());
        System.out.println("Gender: "+healthProfile.getGender()+ "\nDate of Birth: "+healthProfile.getDay()+" "+healthProfile.getMonth()+" "+healthProfile.getYear());
        healthProfile.dateOfBirth();
        System.out.println();
        healthProfile.bmi();
        System.out.println();
        healthProfile.heartRate();
        System.out.println();
        healthProfile.targetRateRange();
    }
}
