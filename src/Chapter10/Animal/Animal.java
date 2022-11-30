package Chapter10.Animal;

public class Animal implements Movable {

    public void speak(){
        System.out.println("I can speak like an animal");
    }

    @Override
    public void move() {
        System.out.println("Animal movement");
    }

    @Override
    public void moveSlowly() {

    }


}
