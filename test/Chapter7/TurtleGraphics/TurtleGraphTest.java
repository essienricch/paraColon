package Chapter7.TurtleGraphics;

import Chapter7.TurtleGraphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Chapter7.TurtleGraphics.Direction.EAST;
import static Chapter7.TurtleGraphics.Direction.SOUTH;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphTest {

    Turtle ijapa;

    @BeforeEach
    void setUp(){
        ijapa = new Turtle();
    }

    @Test
    void turtleExistsTest(){
        assertNotNull(ijapa);
    }

    @Test
    void turtleCanMovePenUpTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    void turtleTurnRightWhileFacingEastTest(){
        assertEquals(EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getDirection());
    }
}
