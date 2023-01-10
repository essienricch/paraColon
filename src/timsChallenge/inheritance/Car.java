package timsChallenge.inheritance;

public class Car extends Vehicle{

    private String handSteering;


    public void turnRight(){
        handSteering = "Turn to the right";
        System.out.println(" made a "+ handSteering);
    }

    public void turnLeft(){
        handSteering = "Turn to the left";
        System.out.println(" made a " + handSteering);
    }
    
    public int changeGear(int gear){
        int speed = 0;
        if (gear == 1){
            return speed = 10;
        } else if (gear == 2) {
            return speed = 20;
        } else if (gear == 3) {
            return speed = 30;
        } else if (gear == 4) {
            return speed = 40;
        }else {
            return speed = 50;
        }
    }

}
