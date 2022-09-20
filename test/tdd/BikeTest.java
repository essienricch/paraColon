package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void turnOnBikeTest(){
        Bike bajaj =new Bike();
        bajaj.turnOn (true);
        boolean isOn = bajaj.turnOn(true);
        assertTrue(isOn);
    }

    @Test
    public void turnOffBikeTest(){
        Bike bajaj = new Bike();
        bajaj.turnOff(false);
        boolean isOff = bajaj.turnOff(false);
    }

    @Test
    public void accelerationBikeTest(){
        Bike bajaj = new Bike();
        bajaj.accelerate();
        String acceleration = bajaj.showBajaj();
        assertTrue (true);



    }

    @Test
    public void accelerationBikeGearOne(){
        Bike bajaj = new Bike();
        bajaj.accelerateGearOne();
        int gear = bajaj.showGear1();
        assertEquals(1,gear);

    }

    @Test
    public void accelerationBikeGearTwo(){
        Bike bajaj = new Bike();
        bajaj.accelerateGearTwo();
        int gear = bajaj.showGear2();
        assertEquals(2,gear);
    }

    @Test
    public void accelerationBikeGearThree(){
        Bike bajaj = new Bike();
        bajaj.accelerateGearThree();
        int gear = bajaj.showGear3();
        assertEquals(3, gear);
    }

    @Test
    public void accelerationBikeGearFour(){
        Bike bajaj = new Bike();
        bajaj.accelerateGearFour();
        int gear = bajaj.showGear4();
        assertEquals(4,gear);
    }

    @Test
    public void decelerationBikeTest(){
        Bike bajaj = new Bike();
        bajaj.decelerate();
        String gear = bajaj.showBajaj();
        assertEquals("decrease", gear);

    }

    @Test
    public void decelerationBikeGearOne(){
        Bike bajaj = new Bike();
        bajaj.decelerateGearOne();
        int gear = bajaj.showGear1();
        assertEquals(-1,gear);
    }

    @Test
    public void decelerationBikeGearTwo(){
        Bike bajaj = new Bike();
        bajaj.decelerateGearTwo();
        int gear = bajaj.showGear2();
        assertEquals(-2, gear);
    }

    @Test
    public void decelerationBikeGearThree(){
        Bike bajaj = new Bike();
        bajaj.decelerateGearThree();
        int gear = bajaj.showGear3();
        assertEquals(-3,gear);
    }

    @Test
    public void decelerationBikeGearFour(){
        Bike bajaj = new Bike();
        bajaj.decelerateGearFour();
        int gear = bajaj.showGear4();
        assertEquals(-4,gear);
    }

    @Test
    public void testForGear1(){
        Bike bajaj = new Bike();
        int froGear = 10;
        String mech = bajaj.froGear(froGear);
        assertEquals("gear1", mech);

    }

    @Test
    public void testForGear2(){
        Bike bajaj = new Bike();
        int froGear = 21;
        String mech = bajaj.froGear(froGear);
        assertEquals("gear2", mech);

    }

    @Test
    public void testForGear3(){
        Bike bajaj = new Bike();
        int froGear = 31;
        String mech = bajaj.froGear(froGear);
        assertEquals("gear3", mech);
    }

    @Test
    public void testForGear4(){
        Bike bajaj = new Bike();
        int froGear = 41;
        String mech = bajaj.froGear(froGear);
        assertEquals("gear4",mech);
    }
}
