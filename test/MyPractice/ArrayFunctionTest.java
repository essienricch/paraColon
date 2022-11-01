package MyPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFunctionTest {

    @Test
    void arrayFunctTest(){
        int [] number = {3,4};
        int [] revArray = ArrayFunction.swapArray(number);
        assertArrayEquals(new int[]{4,3},revArray);
    }
}
