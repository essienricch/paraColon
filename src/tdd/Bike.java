package tdd;

public class Bike {

    private String bajaj;
    private int acceleration;
    private int gear;

    public boolean turnOn(boolean True) {
        boolean turnOn = true;
        return turnOn;
    }

    public boolean turnOff(boolean False) {
        boolean turnOff = false;
        return turnOff;
    }

    public String showBajaj() {
        return bajaj;
    }


    public void accelerate() {
        String acceleration = "increase";
    }

    public void setGear(int variable) {
        this.gear = variable;
    }

    public int getGear() {
        return gear;
    }

    public void accelerateGearOne() {
        gear = gear + 1;
    }

    public int showGear1() {
        return gear;
    }

    public void accelerateGearTwo() {
        gear = gear + 2;
    }

    public int showGear2() {
        return gear;
    }

    public void accelerateGearThree() {
        gear = gear + 3;

    }

    public int showGear3() {
        return gear;
    }

    public void accelerateGearFour() {
        gear = gear + 4;
    }

    public int showGear4() {
        return gear;
    }

    public void decelerate() {
        bajaj = "decrease";
    }

    public void decelerateGearOne() {
        gear = gear - 1;
    }

    public void decelerateGearTwo() {
        gear = gear - 2;
    }

    public void decelerateGearThree() {
        gear = gear - 3;
    }

    public void decelerateGearFour() {
        gear = gear - 4;
    }

    public String froGear(int froGear) {
        if (froGear >= 0 && froGear <= 20) {
            return "gear1";
        }
        if (froGear > 20 && froGear <= 30) {
            return "gear2";
        }

        if (froGear > 30 && froGear <= 40) {
            return "gear3";
        } else {
            return "gear4";
        }
    }
}