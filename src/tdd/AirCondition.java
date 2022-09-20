package tdd;

import java.util.function.Supplier;

public class AirCondition {
    private boolean isOn;
    private int temperature;

    public boolean isOn(boolean True) {
        boolean isOn = true;
        return isOn;
    }

    public boolean isOff(boolean False) {
        return false;
    }



    public int showTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int decrease) {
        temperature = temperature - decrease;
        if (temperature < 16) {
            temperature = 16;
        }
    }

    public void increaseTemperature(int increase) {
        temperature = temperature + increase;
        if (temperature > 30) {
            temperature = 30;
        }
    }
}