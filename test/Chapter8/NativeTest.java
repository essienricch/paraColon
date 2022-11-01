package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {

    @Test
    void constructorSetTest(){
        Human human = new Human();
        human.setFirstName("Doro");
        human.setLastName("Buchi");
        human.setPhoneNumber("09098796756");
        human.setEmailAddress("hessmd@yahoo.uk");

        Native cohort = new Native(human);
        assertEquals("Doro", cohort.getFirstName());
        assertNull(cohort.getAddress());
        assertEquals("09098796756",cohort.getPhoneNumber());
    }

}