package timsChallenge.polymorphism;

public class Bentley extends Car{


    public Bentley(String name, int cylinder) {
        super(name, cylinder);
    }

    public void brake(){
        System.out.println("Bentley brake() -> called ");
    }
}
