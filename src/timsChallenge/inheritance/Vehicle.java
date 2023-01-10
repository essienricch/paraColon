package timsChallenge.inheritance;

public class Vehicle {


    public void moving(int speed){
        if (speed >= 30) {
            System.out.println(" moving at an increased speed of " + speed + "m/s");
        }else {
            System.out.println(" moving at a decreased speed of " + speed + "m/s");
        }
    }

}
