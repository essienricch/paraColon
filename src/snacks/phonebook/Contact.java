package snacks.phonebook;

public class Contact {

    private String name;
    private String number;
    private String emailAddress;

    public Contact(){

    }
    public Contact(String number){
        this.number = number;
    }

    public Contact( String name, String number){
        this.name = name;
        this.number = number;
        this.emailAddress = null;
    }

    public Contact(String name, String number, String emailAddress){
        this.name = name;
        this.number = number;
        this.emailAddress = emailAddress;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
