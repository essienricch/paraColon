package dsa.array.regular;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateArrayTest {

    private IntermediateArray intermediateArray;
    private int [] number = {1,2,3,4,5};
    int post = 3;

    @BeforeEach
    void setUp(){
        intermediateArray = new IntermediateArray();
    }

    @Test
    void intermediateArrayTest(){
      int [] rotate =  intermediateArray.rotate(number, post);
      assertNotEquals(new int[]{3, 4, 5, 1, 2}, rotate);
        System.out.println(Arrays.toString(rotate));
    }

}