package Chapter7.TurtleGraphics;

import Chapter7.TurtleGraphics.SketchPad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SketchPadTest {

    @Test
    void sketchPadCreationTest(){
        SketchPad sp = new SketchPad(2,2);
        assertArrayEquals(new int[][] {{0,0},{0,0}}, sp.getSketchPad());
    }

    @Test
    void addElementsIntoSketchPad(){
        SketchPad sp = new SketchPad(3,3);
        sp.addElements(0,2,1);
        sp.addElements(1,0,1);
        sp.addElements(2,2,1);
        assertArrayEquals(new int [][] {{0,0,1},{1,0,0},{0,0,1}}, sp.getSketchPad());
    }

    @Test
    void graphicalDisplayTest(){
        SketchPad sp = new SketchPad(3,3);
        sp.addElements(0,2,1);
        sp.addElements(1,0,1);
        sp.addElements(2,2,1);
    }
}
