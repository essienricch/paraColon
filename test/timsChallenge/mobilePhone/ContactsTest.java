package timsChallenge.mobilePhone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ContactsTest {

   Contacts contact;

    @BeforeEach
    void setUp(){
        contact = new Contacts("seun","9050403560");
    }

    @Test
    void toTestForContactIsSaved(){
       contact.storeNewContact("80706055403");
        assertEquals("seun",contact.getName().get(0));
        assertNotNull(contact.getPhoneNumber());
    }


    @Test
    void toPrintContactList(){
        contact.queryContactList();
        assertNotNull(contact.getName());
        assertNotNull(contact.getPhoneNumber());
    }

    @Test
    void toSearchForContactInTheList(){
      int index =  contact.findContactIndex("mary");
      assertEquals(-1, index);
    }


    @Test
    void toRemoveFromContactList(){
       assertFalse(contact.removeContact("mercy","9020304050"));
       assertTrue(contact.removeContact("seun", "80706055403"));

    }

}
