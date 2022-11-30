package Chapter9;

public class Dog extends Animal{
    public Dog(){
        super(2);
        System.out.println("Who dey create Dog");
    }

    @Override
    public void speak() {
        System.out.println("Bark like a local dog");
    }

//
}
