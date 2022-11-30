package MyPractice;

public class RelationShip {

    private  String name;
    private  String phoneNumber;
    private Babe girlFriend;

    public void changeBabe(Babe newBabe){
        girlFriend = newBabe;

    }



    public String whatYaBabesName(){
        return girlFriend.getName();
    }

}
