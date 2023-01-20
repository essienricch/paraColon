package Chapter8.hugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    HugeInteger integer;

    @BeforeEach
    public void setUp(){
        integer = new HugeInteger();
    }

    @Test
    public void parseTest(){
        String number = "1234";
        integer.parse(number);
       int[] array = integer.getDigitArray();
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);

    }

        @Test
       public void addTest(){
        assertEquals(9, integer.add(3, 6));

       }

   @Test
    public void subtractTest(){
        assertEquals(2, integer.subtract(6, 4));
   }

    @Test
        public void isEqualTest(){
        assertTrue(integer.isEqual(2, 2));
    }

    @Test
    public void isNotEqualTest(){
        assertTrue(integer.isNotEqual(4,2));
}

    @Test
    public void isGreaterThanTest(){
        assertTrue(integer.isGreaterThan(6,2));
}

    @Test
    public void isLessThanTest(){
        assertTrue(integer.isLessThan(2,4));
    }

    @Test
    public void isGreaterOrEqualToTest(){
        assertTrue(integer.isGreaterThanOrEqualTo(2,2));
    }

    @Test
    public void isLessOrEqualToTest(){
        assertTrue(integer.isLessThanOrEqualTo(2,2));
    }
}
