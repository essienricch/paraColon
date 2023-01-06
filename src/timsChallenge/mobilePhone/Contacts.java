package TimsChallenge.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    private  ArrayList <String> name = new ArrayList<>();
    private  ArrayList <String> phoneNumber = new ArrayList<>();



    Scanner scanner = new Scanner(System.in);

    public Contacts(){
    }

    public Contacts(String myName, String myPhoneNumber){
        this.name.add(myName);
        this.phoneNumber.add(myPhoneNumber);
    }



    public ArrayList<String> getName() {
        return name;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void storeNewContact(String number) {
       int index = findContactIndex(number);
        if (index != -1){
            System.out.println("Contact number already exists in the contact");
            System.out.println("""
                    Press 1 ---->  To Update Existing Contact.
                    Press 2 ---->  To Delete Contact.""");
            String response = scanner.next();
            if (response.equals("1")){
                System.out.println("""
                        Press 1 -----> To update Contact Name
                        Press 2 -----> To update Contact number""");
                String modifyResponse = scanner.next();
                if (modifyResponse.equals("1")){
                    System.out.println("Enter the new name: ");
                    String newName = scanner.nextLine();
                    modifyContact(newName);
                } else if (modifyResponse.equals("2")) {
                    System.out.println("Enter the new number: ");
                    String newNumber = scanner.next();
                }
            } else if (response.equals("2")) {
                removeContact(number);
            }

        } else if (index == -1){
                phoneNumber.add(number);
            System.out.println(" Saving >>>>>>>>>>>>>>");
            System.out.println(" Saved Successfully......");
        }
    }



    public String modifyContact(String contactName, String contactNumb) {
        String newName =contactName;
        String newNumber=contactNumb;
        int nameIndex = findContactIndex(contactName);
        int numberIndex = findContactIndex(contactNumb);
        if (nameIndex >= 0 && numberIndex >= 0) {
            System.out.print("Enter the new contact name to modify: ");
            newName = scanner.nextLine();
            getName().set(nameIndex, newName);
            System.out.print("Enter the new contact number to modify: ");
            newNumber = scanner.nextLine();
            getPhoneNumber().set(numberIndex, newNumber);
            System.out.println(" Saving >>>>>>>>>>>>>>");
            System.out.println(" Saved Successfully......");
        } else {
            System.out.println("Either of the contact do not exists on the list.\nKindly re-check the contact provided");
        }return newName + ": " + newNumber;
    }

    public String modifyContact(String nameOrNumberOfContact){
        String updateContact = nameOrNumberOfContact;
          int index =  findContactIndex(nameOrNumberOfContact);
          if (index >= 0) {
              if (getName().contains(nameOrNumberOfContact)){
                  System.out.print("Enter the new contact name to modify ");
                  String newName = scanner.nextLine();
                  name.set(index, newName);
                  updateContact = newName;
                  System.out.println(" Saving >>>>>>>>>>>>>>");
                  System.out.println(" Saved Successfully......");
              } else if (getPhoneNumber().contains(nameOrNumberOfContact)) {
                  System.out.print("Enter the new contact number to modify: ");
                  String newNumber = scanner.nextLine();
                  getPhoneNumber().set(index, newNumber);
                  updateContact = newNumber;
                  System.out.println(" Saving >>>>>>>>>>>>>>");
                  System.out.println(" Saved Successfully......");
              }
          } else {
              System.out.println("Cant modify what is not on the list");
          }return updateContact;
    }


    public int queryContactList() {
        int totalContact = 0;
        if (getName().size() > 0 && getPhoneNumber().size() > 0){
            if (getName().size() == getPhoneNumber().size() || getName().size() > getPhoneNumber().size()){
                for (int i = 0; i < getName().size(); i++) {
                    System.out.println(i + 1 + ". " + getName().get(i).toUpperCase() + " --> "+ getPhoneNumber().get(i));
                }totalContact = getName().size();
            } else if (getName().size() < getPhoneNumber().size()) {
                for (int i = 0; i < getPhoneNumber().size(); i++) {
                    System.out.println(i + 1 + ". " + getName().get(i).toUpperCase() + " --> "+ getPhoneNumber().get(i));
                }totalContact = getPhoneNumber().size();
            }
        } else if (getName().size() > 0) {
            for (int i = 0; i < getName().size(); i++) {
                System.out.println(i + 1 + ". " + getName().get(i).toUpperCase());
            }totalContact = getName().size();
        } else if (getPhoneNumber().size() > 0){
            for (int i = 0; i < getPhoneNumber().size(); i++) {
                System.out.println(i + 1 + ". " + getPhoneNumber().get(i));
            }totalContact = getPhoneNumber().size();
        }else {
            System.out.println("No contact saved");
        }
        System.out.println();
        return totalContact;
    }



    public int findContactIndex(String nameOrNumberOfContact) {
        int index = -1;
        if (name.contains(nameOrNumberOfContact)) {
            index = name.indexOf(nameOrNumberOfContact);
            System.out.println(nameOrNumberOfContact +" found in index: " + index);
        } else if (phoneNumber.contains(nameOrNumberOfContact)) {
            index = phoneNumber.indexOf(nameOrNumberOfContact);
            System.out.println(nameOrNumberOfContact +" found in index: " + index);
        } else {
            System.out.println(nameOrNumberOfContact + " not found in the contact list");
        }
        return index;
    }


    public boolean removeContact(String contactName, String number) {
        boolean deleted = false;
        int index = findContactIndex(contactName);
        int numberIndex = findContactIndex(number);
        if (index >= 0 && numberIndex >= 0){
            String nameDelete = name.remove(index);
            String numberDelete = phoneNumber.remove(numberIndex);
            deleted = true;
            System.out.println("Contact "+ nameDelete + ": "+numberDelete+" deleted successfully.");
        }else {
            System.out.println("Contact " + contactName.toUpperCase() + number+ " does not exists in the contact list");
        }return deleted;
    }


    public boolean removeContact(String nameOrNumberOfContact) {
        boolean deleted = false;
        int index = findContactIndex(nameOrNumberOfContact);
        if (index >= 0){
            if (nameOrNumberOfContact.equals(name.remove(index))){
                String nameDelete = name.remove(index);
                deleted = true;
                System.out.println("Contact "+ nameDelete  + " deleted successfully");
            } else if (nameOrNumberOfContact.equals(phoneNumber.remove(index))){
                String numberDelete = phoneNumber.remove(index);
                deleted = true;
                System.out.println("Contact "+ numberDelete  + " deleted successfully");
            }
        }else {
            System.out.println("Contact " + nameOrNumberOfContact.toUpperCase() +" does not exists in the contact list");
        }return deleted;
    }
}

