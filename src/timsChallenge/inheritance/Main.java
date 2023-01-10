package timsChallenge.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Porsche porsche = new Porsche("carrera","black");
       porsche.moving(porsche.changeGear(2));
       porsche.turnRight();
        System.out.println("There is a diversion upfront the high-way, you might have to use an alternative route(take left)");
        porsche.turnLeft();
    }
}
