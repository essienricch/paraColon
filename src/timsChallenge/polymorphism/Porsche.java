package timsChallenge.polymorphism;

public class Porsche extends Car{

    public Porsche(String name, int cylinder) {
        super(name, cylinder);
    }

    public void startEngine(){
        System.out.println("Porsche startEngine() -> ");
    }
}
