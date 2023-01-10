package Chapter9;

import Chapter9.livingThing.Dog;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void speakTest(){
        Dog chihuahua = new Dog();
        chihuahua.speak();
    }

}