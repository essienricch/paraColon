package MyPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayElementPositionsTest{

    @Test
    void ToTestOddPosition(){
        int [] numb = {1,2,3,4,5,6,13,23,50,100};
        int[] odd = ArrayElementPositions.oddPosition(numb);
        //assertArrayEquals(new int[]{1,3,5},odd);
        System.out.println(Arrays.toString(odd));
    }

    @Test
    void ToTestEvenPosition(){
        int [] numb = {1,2,3,4,5,6,13,23,50,100};
        int [] even = ArrayElementPositions.evenPosition(numb);
        assertArrayEquals(new int[]{1,3,5,13,50},even);
        System.out.println(Arrays.toString(even));

    }
}
