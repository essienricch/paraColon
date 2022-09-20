package tdd;

import java.security.SecureRandom;

public class CrapGameDie {

    SecureRandom random = new SecureRandom();

    private int face;

    private int rollDie;

    public int rollDie() {
        this.rollDie = rollDie;
        return rollDie;
    }
    public static int rollDices(CrapGameDie a, CrapGameDie b) {
        int face1 = a.rollDie();
        int face2 = b.rollDie();
        return face1 + face2;
    }
}
