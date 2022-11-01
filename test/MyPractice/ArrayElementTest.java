package MyPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayElementTest {

    @Test
    void ToTestOddElement(){
        int [] numb = {1,2,3,4,5};
        int[] odd = ArrayElement.oddValues(numb);
        assertArrayEquals(new int[]{1,3,5},odd);
    }
}
