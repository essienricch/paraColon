package snacks.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {

    private Phonebook myPhone;

    @BeforeEach
    void setUp(){
        myPhone = new Phonebook("richie","wordsmith");
    }

    @Test
    void phonebookExistsTest(){
        assertNotNull(myPhone);
    }

    @Test
    void newPhonebookIsLocked(){
        assertTrue(myPhone.isLocked());
    }

    @Test
    void newPhonebookCanBeUnlockedWithPassword(){
       assertTrue(myPhone.isLocked());

       myPhone.isUnlocked("wordsmith");
       assertFalse(myPhone.isLocked());
    }

    @Test
    void newPhonebookCanBeLocked(){
        assertTrue(myPhone.isLocked());

        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

        assertTrue(myPhone.isLock());
    }

    @Test
    void newPhonebookCanCreateContactList(){
        assertTrue(myPhone.isLocked());

        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

      Contact myContact = myPhone.createContactList();
      assertNotNull(myContact);
    }

    @Test
    void phonebookCanAddContactToTheListTest(){
        assertTrue(myPhone.isLocked());

        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

       Contact myContact = new Contact("ade","0902347586","warres@gmail.com");
        myPhone.addNewContact(myContact);

        assertNotNull(myPhone.getMyContact());

    }

    @Test
    void phonebookCanViewAllContactsAddedInTheList(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

       Contact myContact = new Contact("ade","0902347586","warres@gmail.com");
        myPhone.addNewContact(myContact);
       boolean joContact =  myPhone.viewAllContactsInTheList();
        assertTrue(joContact);

    }

    @Test
    void phonebookCanSearchForContactById(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

      Contact  myContact = new Contact("ade","0902347586","warres@gmail.com");
        myPhone.addNewContact(myContact);

      Contact contact  = myPhone.findContactById(0);
      assertEquals(myContact, contact);
    }

    @Test
    void phonebookCanSearchForContactByName(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

      Contact  myContact = new Contact("ade","0902347586","warres@gmail.com");
        myPhone.addNewContact(myContact);

        Contact contact = myPhone.searchContactByName("ade");
        assertEquals(contact, myContact);
    }

    @Test
    void phonebookCanSearchForContactByNumber(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

        Contact myContact = new Contact("ade","08067084567","warres@gmail.com");
        myPhone.addNewContact(myContact);

        Contact contact = myPhone.searchContactByNumber("08067084567");
        assertEquals(contact, myContact);

    }

    @Test
    void phonebookCanUpdateContactInList(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

       Contact myContact = new Contact("ade","08067084567","warres@gmail.com");
        myPhone.addNewContact(myContact);
        assertNotNull(myContact);

        Contact contact1 = myPhone.updateExistingContact(myContact, "kaka", "09040506070");
       assertTrue(myPhone.getMyContact().contains(myContact));
       assertEquals("kaka",contact1.getName());
    }

    @Test
    void phonebookCanRemoveContactFromListTest(){
        myPhone.isUnlocked("wordsmith");
        assertFalse(myPhone.isLocked());

        Contact myContact = new Contact("ade","08067084567","warres@gmail.com");
        myPhone.addNewContact(myContact);
        assertNotNull(myContact);

        assertTrue(myPhone.deleteContact(myContact));
    }
}
