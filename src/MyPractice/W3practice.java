package MyPractice;


import java.util.Scanner;

public class W3practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1; i <= 5; i++){
        System.out.println("ENTER A DATE (1-7) AND THIS APPLICATION TELLS YOU WHAT DAY IS IT:");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            }
        }
    }
}
