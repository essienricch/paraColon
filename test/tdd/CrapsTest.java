package chapter6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CrapsTest {

    @Test
    public void diceIs7_11Test(){
      Craps myCraps = new Craps();
//      myCraps.setDice();
        String s = Craps.playGame(4);
        System.out.println(s);
    }

    @Test
    public void testGameStatus() {
        assertEquals(Craps.getGameStatus(11),
                Craps.Status.WON);

        assertEquals(Craps.getGameStatus(4),
                Craps.Status.CONTINUE);
    }
}