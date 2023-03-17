package dsa.stackslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleOneTest {

    @Test
    void toSumStackTest(){
        String [] arrayNumb = {"2","4","*","3"};
        String operate = "+";
        int sumOfNumberInStack = SampleOne.stackSum(arrayNumb,operate);
        assertEquals(3,sumOfNumberInStack);
    }

}