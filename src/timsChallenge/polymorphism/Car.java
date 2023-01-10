package timsChallenge.polymorphism;

public class Car {

    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;


    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }


    public void startEngine(){
        System.out.println("Starting the Engine.....");
    }

    public void accelerate(){
        System.out.println("accelerate() -> called ");
    }

    public void brake(){
        System.out.println("Break() -> called ");
    }
}
