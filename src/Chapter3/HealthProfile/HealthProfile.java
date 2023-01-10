package Chapter3.HealthProfile;

import java.util.Scanner;

public class HealthProfile {

    Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private String month;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String firstName,String lastName,String gender,int day,String month,int year,double height,double weight){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.day=day;
        this.month=month;
        this.year=year;
        this.height=height;
        this.weight=weight;
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

        public void setGender(String gender){
            this.gender = gender;
        }
        public String getGender(){
            return gender;
        }

        public void setDay(int day){
            this.day = day;
        }
        public int getDay(){
            return day;
        }

        public void setMonth(String month){
            this.month = month;
        }
        public String getMonth(){
            return month;
        }

        public void setYear(int year){
            this.year=year;
        }
        public int getYear(){
            return year;
        }

        public void setHeight(double height){
            System.out.println("Set up your height(M): ");
            height = scanner.nextDouble();
            this.height = height;
        }
        public double getHeight(){
            return height;
        }

        public void setWeight(double weight){
            System.out.println("Set up your weight(KG): ");
            weight = scanner.nextDouble();
            this.weight=weight;
        }

    public double getWeight() {
        return weight;
    }


    public void dateOfBirth(){
        int age = 2022 - year;
        System.out.println("You are "+age+" year old");
    }

    public void bmi(){
        double bmi = weight / (height * height);
        System.out.printf("%s%.2f","Your body mass index is: ",bmi);
    }

    public void heartRate(){
        System.out.println("Enter your age to determine your heart rate: ");
        int ageForHrtRate = scanner.nextInt();
        System.out.println("Your heart rate beats at "+(220 - ageForHrtRate)+" per minute");

    }

    public void targetRateRange(){
        System.out.println("Enter your heart rate(Bpm): ");
        int targetRate = scanner.nextInt();
        System.out.println("Your heart rate range is: "+(0.85 * targetRate));

    }
}
