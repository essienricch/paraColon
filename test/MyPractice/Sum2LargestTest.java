package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum2LargestTest {
    @Test
    void toTestTwoLargeElement(){
        int [] numb = {1,2,3,4,5};
       int [] large = Sum2Largest.largeElement(numb);
       assertArrayEquals(new int[]{4,5},large);
    }

    @Test
    void toTestLargeSum(){
        int [] large = {4,5};
       int sum = Sum2Largest.largeSum(large);
       assertEquals(9,sum);
    }
}
