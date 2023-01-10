package timsChallenge.constructors;



public class Accounts {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Accounts(String customerName, String accountNumber, String customerPhoneNumber){
        this(customerName,accountNumber,customerPhoneNumber,0.0,"Null");
    }

    public Accounts(String customerName, String accountNumber, String customerPhoneNumber,double balance, String customerEmail){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.balance = balance;
        this.customerEmail = customerEmail;
    }

    public  void setAccountNumber(String number){
        this.accountNumber = number;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public double depositFunds(double amount ){
        if (amount >= 0.0 ){
            balance += amount;
        }return amount;
    }

    public double withdrawFunds(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("You made a withdrawal of "+amount);
        }else {
            throw new IllegalArgumentException("Withdrawal amount is greater than balance, You are a thief");
        }return amount;
    }


}
