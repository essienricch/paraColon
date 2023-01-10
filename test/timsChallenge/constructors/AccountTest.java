package timsChallenge.constructors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    private Accounts accounts;

    @BeforeEach
    void setUp(){
        accounts = new Accounts("Richard","12345","55678");
    }

    @Test
    void toTestThatWeHaveAnAccountClass(){
        assertNotNull(accounts);
    }

    @Test
    void accountCanDepositFundsTest(){
       double amount = accounts.depositFunds(50000.0);
       assertEquals(50_000.0, amount);
    }

    @Test
    void toTestThatAccountCanWithdraw(){
        double amount = accounts.depositFunds(50000.0);
        assertEquals(50_000.0, amount);

       double withdrawAmount =  accounts.withdrawFunds(5000.0);
        assertEquals(5000.0, withdrawAmount);
    }
}
