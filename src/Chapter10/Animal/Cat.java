package Chapter10.Animal;

import Chapter10.Animal.Animal;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
    public void chaseMice(){
        System.out.println("chasing mice");
    }
}
