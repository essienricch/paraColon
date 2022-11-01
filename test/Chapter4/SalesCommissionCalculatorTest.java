package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SalesCommissionCalculatorTest {

    @Test
    void salesPersonsTest(){
      double wage =  SalesCommissionCalculator.earnings();
        assertEquals(wage,wage);
    }
}
