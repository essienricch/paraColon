package timsChallenge.constructors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VipCustomerTest {

    private VipCustomer richBling;

    @BeforeEach
    void setUp(){
        richBling = new VipCustomer();
    }

    @Test
    void testThatVipCustomerClassExists(){
        assertNotNull(richBling);
        System.out.println(richBling.getCustomerName());
    }
}
