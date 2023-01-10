package timsChallenge.arrays;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinElementTest {

    private static int [] timArray;

    @BeforeEach
    void setUp(){
        timArray = MinElement.setArraySize(5);
    }



  @Test
    void toTestThatIntegerAreInTheArray(){
      timArray = MinElement.getIntegers(4);
      assertArrayEquals(new int []{0,4,8,12,16},timArray);
  }


  @Test
    void toTestForTheMinimumValueInTheArray(){
        int [] number = {34,54,67,21,55};
       int minimum =  MinElement.findMinimum(number);
       assertEquals(21,minimum);
  }


//    public void modifyContact(int modifyContactOption) {
//        System.out.println("You selected " + modifyContactOption + " of the modify option" );
//        switch (modifyContactOption) {
//            case 1 ->  modifyNme();
//            case 2 -> modifyNumbs();
//            case 3 -> noMdifyContact();
//        }
//    }
//
//
//
//    private void modifyNumbs(){
//        int PhoneIndex = -1;
//        System.out.print("Enter the new contact phone-number and index to modify ");
//        String newNumber = scanner.nextLine();
//        phoneNumber.set(PhoneIndex,newNumber);
//        System.out.println(" Saving >>>>>>>>>>>>>>");
//        System.out.println(" Saved Successfully......");
//    }
//
//    private void modifyNme(){
//        int PhoneIndex = -1;
//        System.out.print("Enter the Contact name you choose to modify for validation if it exists in the contact list ");
//        String contactName = scanner.nextLine();
//        if (name.contains(contactName)) {
//            System.out.print("Enter the  ID and new contact name to modify ");
//            PhoneIndex = scanner.nextInt();
//            String newName = scanner.nextLine();
//            name.set(PhoneIndex, newName);
//            System.out.println(" Saving >>>>>>>>>>>>>>");
//
//
//            System.out.println("Would you like to Modify the phone-number of the same contact.\n press 1 to modify the number or press 2 to end modify: ");
//            int modifyPhone = scanner.nextInt();
//            if (modifyPhone == 1) {
//                System.out.print("Enter the new contact phone-number and index to modify ");
//                String newNumber = scanner.nextLine();
//                phoneNumber.set(PhoneIndex, newNumber);
//                System.out.println(" Saving >>>>>>>>>>>>>>");
//                System.out.println(" Saved Successfully......");
//            } else {
//                System.out.println(" Contact Name Saved Successfully......");
//            }
//        }
//    }
//
//    private void noMdifyContact(){
//        System.out.println("Contact not Found in the contact list");
//    }

}
