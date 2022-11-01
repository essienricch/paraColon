package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumMinMaxTest {
    int [] numbers = {1,2,3,4,5};
    @Test
    public void ArraySetSum(){
        int sum = Arrays.addSet(numbers);
        assertEquals(15, sum);
    }

    @Test
    public void ArrayMin(){
        int min = Arrays.minValue(numbers);
        assertEquals(1, min);
    }

    @Test
    public void ArrayMax(){
        int max = Arrays.maxValue(numbers);
        assertEquals(5, max);
    }
}
