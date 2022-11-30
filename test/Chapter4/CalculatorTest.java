package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    void getFactorial(){
       int result = Calculator.factorial(5);
       assertEquals(120,result);
    }

}
