package Chapter3;


class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("Emmanuel Essien",50_000);
        Account account1 = new Account("Daniel", 25000);
      //  System.out.println("Welcome to First-Bank \nCustomer: "+Account.setName("Emmanuel Essien"));
        System.out.println();
        //System.out.println(Account.deposit()+ " deposited into: " +Account.getName()+" Account");
        System.out.println();
       // System.out.println(Account.withdraw()+ " Withdrawn from: "+ Account.getName()+ " Account");
        System.out.println("UPDATED BALANCE: ");
        Account.displayAccount(account);


    }

}