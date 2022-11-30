package Chapter10;

import Chapter10.Animal.Animal;
import Chapter10.Animal.Dog;
import Chapter10.Animal.Goat;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void polymorphismTest(){
        Animal max = new Dog() {
            @Override
            public void fight() {

            }
        };
        max.speak();
        Dog maxy = new Dog() {
            @Override
            public void fight() {

            }
        };
        maxy.eat();
        Animal mygoat = new Goat();
        mygoat.move();
    }

}