package timsChallenge.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayChallengeTest {

    @Test
    void getArrayToPrintTest(){
       int [] myArray  = {23,50,32,14,45};
      int [] confirmThisArray =  ArrayChallenge.getIntegers(myArray);
        assertArrayEquals(myArray,confirmThisArray);
    }

    @Test
    void letSortInDescendingOrderTest(){
        int [] myArray  = {23,50,32,14,45};
       int [] sort = ArrayChallenge.sortInDescendOrder(myArray);
       assertArrayEquals(new int[]{50,45,32,23,14}, sort);
    }

    @Test
    void findMinimumElementTest(){
        int [] myArray  = {23,50,32,14,45};
        int minimum = ArrayChallenge.findMinimumElement(myArray);
        assertEquals(14,minimum);

    }
}
