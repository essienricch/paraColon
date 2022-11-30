package Chapter10.Animal;

import Chapter10.Animal.Animal;

public class Goat extends Animal {
    @Override
    public void speak() {
        System.out.println("i bleat");
    }

    public void move(){
        System.out.println("gentle step observing");
    }
}
