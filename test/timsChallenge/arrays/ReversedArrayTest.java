package timsChallenge.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversedArrayTest {

    @Test
    void toTestForReverseArray(){
        int [] number = {1,2,3,4,5};
       assertArrayEquals(new int []{5,4,3,2,1}, ReversedArray.reverenceReverse(number));
    }
}
