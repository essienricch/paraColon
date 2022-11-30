package Chapter10.Animal;

import Chapter10.Animal.Animal;

public abstract class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("I bark like max");
    }
    public void eat(){
        System.out.println("Eat bone");
    }
//    public void move() {
//        System.out.println("i dog-walk");
//    }

    public abstract void fight();


}
