package Chapter8;

import java.util.Arrays;

import static Chapter8.Day.*;
import static java.lang.System.out;
import static Chapter8.Region.*;

public class NativesMain {
    public static void main(String[] args) {
        Natives c13 = new Natives(FRIDAY);
        Region region = Region.SOUTH_SOUTH;
        out.println(Arrays.toString(SOUTH_SOUTH.getStates()));
        out.println(c13.getDayOfBirth());
    }
}
