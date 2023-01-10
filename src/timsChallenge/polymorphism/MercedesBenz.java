package timsChallenge.polymorphism;

public class MercedesBenz extends Car{

    public MercedesBenz(String name, int cylinder) {
        super(name, cylinder);
    }

    public void accelerate(){
        System.out.println("Benz.accelerate() -> called ");
    }
}
