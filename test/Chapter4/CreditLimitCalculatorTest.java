package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditLimitCalculatorTest {

    @Test
    public void accountNumber(){
       CreditLimit.addAcctNumber(243567902);
        assertTrue(true);
    }

    @Test
    public void balanceAtTheBeginningTest(){
        CreditLimit.mainBalance(25000);
        assertTrue(true);
    }

    @Test
    public void totalChargesTest(){
        CreditLimit.itemCharges(10);
        assertTrue(true);
    }

    @Test
    public void totalCreditTest(){
        CreditLimit.clientCredit(5000);
    }

    @Test
    public void balanceTest(){
        int balance =CreditLimit.newbalances(20000,500,5000);
        assertEquals(15500,balance);
    }
}
