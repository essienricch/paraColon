package Chapter8;

import java.util.Arrays;

public enum Region {
    SOUTH_SOUTH("Akwa-ibom","Cross-River","Rivers"),
    SOUTH_EAST("Lagos","Ogun","Osun"),
    NORTH_NORTH("Abuja","Sokoto","Kaduna");

    private final String[] states;

    Region(String... states){
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }
}
