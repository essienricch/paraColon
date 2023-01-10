package timsChallenge.mobilePhone;
import java.time.LocalTime;
import java.util.Scanner;

public class MobilePhone {

    private String brandName;
    private  boolean powerMode;

    Contacts contacts;

    static LocalTime localTime;
    static Scanner scanner = new Scanner(System.in);


    public MobilePhone(){
        this.contacts = new Contacts();
    }

    public MobilePhone(String phoneName){
        this.brandName = phoneName;
        this.contacts = connectSimContactList();
    }


    public boolean turnPowerModeOn() {
        boolean isOn = true;
        if (!isPowerMode()) {
            System.out.print("What would you like to call your prototype: ");
            String name = scanner.nextLine();
            setBrandName(name);
            setPowerMode(isOn);
            System.out.println(getBrandName() + " Power On......");
        }else {
            System.out.println(getBrandName() + " Power is already On");
        }
        return isOn;
    }

    public boolean turnPowerModeOff() {
        boolean isOff = false;
        if (isPowerMode()){
            setPowerMode(isOff);
            System.out.println(getBrandName()+ " Shut Down ....");
        }
        return isOff;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        System.out.printf("%s%s%s","|----------------------->   \t",localTime, " \t    <-----------------------|");
        System.out.println("Welcome to " + brandName + " Cypher-tech collection. Enjoy your experience");
        this.brandName = brandName;
        System.out.println();
        System.out.printf("%s","|--------------------------------------------|");
    }

    private boolean isPowerMode() {
        return powerMode;
    }

    private void setPowerMode(boolean powerMode) {
        this.powerMode = powerMode;
    }

    public Contacts connectSimContactList() {
        System.out.println("Contact list Activated");
        return new Contacts("Bob Marley","Tuff Gong");
    }

    public int printContactList() {
        int numberOfSavedContacts = 0;
        System.out.println("Saved Contacts: ");
        numberOfSavedContacts = contacts.queryContactList();

        System.out.println("Total number of Saved Contacts: " + numberOfSavedContacts);
        return numberOfSavedContacts;
    }

    public void addNewContact() {
    }
}
