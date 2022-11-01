package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighSumMinMaxTest {

    int [] numbers = {1,2,3,4,5};

    @Test
    public void minTest(){
        //when
        int result = HigherSumMinMax.maxHigh(numbers);
        //assert
        assertEquals(14, result);
    }
}
