package Chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void speakTest(){
        Dog chihuahua = new Dog();
        chihuahua.speak();
    }

}