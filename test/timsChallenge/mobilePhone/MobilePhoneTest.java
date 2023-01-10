package timsChallenge.mobilePhone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MobilePhoneTest {

    MobilePhone infinix;

    @BeforeEach
    void setUp(){
        infinix = new MobilePhone();
    }

    @Test
    void toTestThatWeHaveMobilePhone(){
        assertNotNull(infinix);
    }

    @Test
    void toSetPowerModeOn(){
        assertTrue(infinix.turnPowerModeOn());
    }

    @Test
    void toSetPowerModeOff(){
        assertFalse(infinix.turnPowerModeOff());
    }

    @Test
    void toTestThatWeHaveContactListInMobilePhone(){
        assertNotNull(infinix.connectSimContactList());
    }

    @Test
    void toSetPrintContactListMenu(){
        assertTrue(infinix.printContactList() > 0);
    }

    @Test
    void toTestForWhenWeAddNewContact(){
        infinix.addNewContact();
    }
}
