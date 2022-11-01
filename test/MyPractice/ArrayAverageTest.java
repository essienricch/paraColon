package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAverageTest {

    @Test
    public void Average(){
        int [] numb = {10,2,3,15,5};
        ArrayAverage arrAverage = new ArrayAverage();
        int average = arrAverage.averageNumb(numb);
        assertEquals(7,average);

    }
}
