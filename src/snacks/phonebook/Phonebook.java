package snacks.phonebook;

import java.util.ArrayList;
import java.util.List;


public class Phonebook {

    private boolean isLocked;
    private String password;
    private String userName;

    private List<Contact> myContact;

    public Phonebook(String userName, String password){
        this.password = password;
        this.isLocked = true;
        this.userName = userName;
        myContact = new ArrayList<Contact>();
    }
    public boolean isLocked() {
        return isLocked;
    }

    public List<Contact> getMyContact() {
        return myContact;
    }

    public void isUnlocked(String password) {
        if (password.equals(this.password)){
            isLocked = false;
        }
    }

    public boolean isLock() {
      return isLocked = true;
    }

    public Contact createContactList() {
        return new Contact();
    }

    public void addNewContact(Contact contact) {
            myContact.add(contact);
    }

    public boolean viewAllContactsInTheList() {
        topHeader();
        int i;
        for (i = 0; i < myContact.size(); i++) {
            System.out.printf("%d%s%s",i+1,". ",myContact.get(i));
        }downHeader();
        return true;
    }

    private void topHeader(){
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println("\nCONTACTS: ");
    }

    private void downHeader(){
        System.out.println();
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
    }


    public Contact findContactById(int id) {
        return myContact.get(id);
    }

    public Contact searchContactByName(String name) {
        for (Contact contact : getMyContact()){
            if (contact.getName().equals(name)){
                return contact;
            }
        }return null;
    }

    public Contact searchContactByNumber(String number) {
        for (Contact contact : getMyContact()){
            if (contact.getNumber().equals(number)){
                return contact;
            }
        }return null;

    }

    private int findContactIndex(Contact contact){
        int index = -1;
        for (Contact contacts: getMyContact()){
            if (contacts.equals(contact)) {
                index = getMyContact().indexOf(contacts);
            }
        }return index;
    }

    public Contact updateExistingContact(Contact contact, String newName, String newNumber ) {
        Contact contact1 = null;
        int indexOfOldContact = findContactIndex(contact);
        if (indexOfOldContact >= 0){
            contact = new Contact(newName,newNumber);
            myContact.add(indexOfOldContact, contact);
            contact1 = contact;
        }return contact1;
    }

    public boolean deleteContact(Contact contact) {
        boolean status = false;
        int indexContactSearch = findContactIndex(contact);
        if (indexContactSearch >= 0){
            myContact.remove(indexContactSearch);
            status = true;
        }
        return status;
    }
}
