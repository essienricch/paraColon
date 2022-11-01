package Chapter3;

import java.time.Year;
import java.util.Scanner;

public class HeartRates {

    Scanner input = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String month;
    private int day;
    private int year;
    private int heartRate;

    public HeartRates(String firstName, String lastName, String month, int day, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }

    public void  setMonth(String month){
        this.month= month;
    }
    public String getMonth(){
        return month;
    }

    public void setYear(int Year){
        this.year = Year;
    }
    public int getYear(){
        return year;
    }

    public void getAge(){
        int age = 2021 - year;
        System.out.println("Your age is: "+age);;
    }

    public void heartRate(){
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        heartRate = 220 - age;
        System.out.printf("%s%d%s%n", "Your heart beats at ",heartRate," per minute");
    }

    public int maxMinTargetRate(){
        int max = (int) (heartRate * 0.85);
       // int min = (int) (heartRate * 0.50);
        return max;
    }
}
