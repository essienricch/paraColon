package Chapter3.Clock;


import java.util.Scanner;

class ClockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clock clock = new Clock(15,44,69);

        System.out.println("Enter the Hour: ");
        int hour = scanner.nextInt();
        clock.setHour(hour);

        System.out.println("Enter the Minute: ");
        int minute = scanner.nextInt();
        clock.setMinute(minute);

        System.out.println("Enter the Second: ");
        int secs = scanner.nextInt();
        clock.setSecond(secs);

        clock.displayTime();
    }

}