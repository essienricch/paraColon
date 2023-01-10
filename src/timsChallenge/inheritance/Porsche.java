package timsChallenge.inheritance;

public class Porsche extends Car{

     private String name;
     private String color;


     public Porsche(String name, String color){
         this.name = name;
         this.color = color;
     }

    @Override
    public void turnRight() {
        System.out.print(name);
        super.turnRight();
    }

    @Override
    public void turnLeft() {
        System.out.print(name);
        super.turnLeft();
    }

    @Override
    public int changeGear(int gear) {
        return super.changeGear(gear);
    }

    @Override
    public void moving(int speed) {
        System.out.print(name);
        super.moving(speed);
    }
}
