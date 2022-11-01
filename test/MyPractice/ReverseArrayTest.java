package MyPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseArrayTest {


    @Test
    public void reverseNumberTest(){
        int [] reversedNumb = {1,2,3,4,5};
        int [] reverseArray = ArrReverse.reverse(reversedNumb);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1},reverseArray);

    }

    @Test
    public void StringReverseArray(){
        //given i have a string:
        String input = "Anikulakpo";
        String output = ArrReverse.reverse(input);
        assertEquals("opkalukinA",output);
    }

    @Test
    public void reverseOneLineStringTest(){
        String input = "Adeleke";
        String output = ArrReverse.oneLineReverse(input);
        assertEquals("ekeledA",output);
    }

    @Test
    public void toSentenceCase(){
        String input = "JERRY";
        String output = ArrReverse.toSentenceCase(input);
        assertEquals("Jerry",output);
    }
}
