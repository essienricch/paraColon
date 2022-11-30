package MyPractice;

import java.util.Arrays;

public class Customer {

    private String name;
    private String phoneNumber;
    private String address;
    private double loyaltyPoint;
    private static final double weMissYouDiscount = 0.1;

    public Customer(String name, String phoneNumber, String address, double loyaltyPoint){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.loyaltyPoint = loyaltyPoint;
    }

    public void setClientDetails(String name, String phoneNumber, String address){
        this.name = name.toUpperCase();
        this.phoneNumber = phoneNumber;
        this.address = address.toUpperCase();
    }

    public void clientLookUp(String phoneNumber){
        String [] initializeTemplate = {name,this.phoneNumber,address};
        String [] clientDetails = new String[initializeTemplate.length];
        if (phoneNumber.equals(this.phoneNumber)){
            System.arraycopy(initializeTemplate, 0, clientDetails, 0, initializeTemplate.length);
            System.out.println(Arrays.toString(clientDetails));
        }else System.out.println("Customer Details not found");
    }

    public double applyWeMissYouDiscount(String phoneNumber, double total){
        double discount = 0;
        if (phoneNumber.equals(this.phoneNumber)){
            discount = total * weMissYouDiscount;
            System.out.println("10 percent discount off your purchase: " + (discount));
        }return (discount - total);
    }

    public String [] getClientDetails(String phoneNumber){
        String [] initializeTemplate = {name,this.phoneNumber,address};
        String [] clientDetails = new String[initializeTemplate.length];
        if (phoneNumber.equals(this.phoneNumber)){
            System.arraycopy(initializeTemplate, 0, clientDetails, 0, initializeTemplate.length);
        }return new String[]{Arrays.toString(clientDetails)};
    }

    public double payWithLoyaltyPoint() {
        double main = 0;
        main = loyaltyPoint / 10;
        return main;
    }

    public void addLoyaltyPoint(double total) {
        this.loyaltyPoint += total * 0.1;
    }


    public void setName(String name) {
       this.name = name.toUpperCase();
    }

    public String getName() {
        return name;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address.toUpperCase();
    }

    public String getAddress() {
        return address;
    }

    public double getLoyaltyPoint() {
        return loyaltyPoint;
    }
}
