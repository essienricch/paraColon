package tdd.AirConditionerTest;

import org.junit.jupiter.api.Test;
import tdd.AirCondition;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test


    public void isOnAirConditionerTest() {
        AirCondition myAirconditioner = new AirCondition();
        myAirconditioner.isOn(true);
        boolean isOn = myAirconditioner.isOn(true);
        assertTrue(isOn);
    }

    @Test
    public void isOffAirConditionerTest() {
        AirCondition myAirConditioner = new AirCondition();
        myAirConditioner.isOn(true);
        myAirConditioner.isOff(false);
        boolean isOff = myAirConditioner.isOff(false);
        assertFalse(isOff);

    }

    @Test
    public void increaseTemperature() {
        AirCondition myAirConditioner = new AirCondition();
        myAirConditioner.increaseTemperature(30);
        int temperature = myAirConditioner.showTemperature();
        assertEquals(30, temperature);
    }

    @Test
    public void decreaseTemperature() {
        AirCondition myAirConditioner = new AirCondition();;
        myAirConditioner.increaseTemperature(25);
        myAirConditioner.decreaseTemperature(5);
        int temperature = myAirConditioner.showTemperature();
        assertEquals(20, temperature);
    }

    @Test
    public void whenIncreaseTemperatureBeyond30Test() {
        AirCondition myAirConditioner = new AirCondition();
        myAirConditioner.increaseTemperature(25);
        myAirConditioner.increaseTemperature(10);
        int temperature = myAirConditioner.showTemperature();
        assertEquals(30, temperature);


    }


    @Test
    public void whenDecreaseTemperatureBeyond16Test() {
        AirCondition myAirConditioner = new AirCondition();
        myAirConditioner.decreaseTemperature(20);
        myAirConditioner.decreaseTemperature(10);
        int temperature = myAirConditioner.showTemperature();
        assertEquals(16,temperature);


    }
}