package timsChallenge.bills_burger;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    protected String burgerName;
    protected  String breadRollType;
    protected  boolean meat;
    protected final double price = 5.00;
    protected List <Additional> additions;


    public Hamburger(String burgerName, String breadRollType, boolean meat) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additions = new ArrayList<>(4);
    }

    public Hamburger() {
        this.additions = new ArrayList<>();
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }



    public void addExtras(){
        additions.add(new Additional("LETTUCE", 3.5));
        additions.add(new Additional("CARROT", 3.0));
        additions.add(new Additional("TOMATO",3.0));
        additions.add(new Additional("CHEESE", 3.5));
    }

    public String viewBurgerExtrasPrice(String extraName){
        for (Additional additional: additions){
            if (additional.getName().equals(extraName.toUpperCase())){
                return additional.toString();
            }
        }return " Sorry, Extra not available. ";
    }

    public void takeOrder(String extra){
        for (Additional additional: additions){
            if (additional.getName().equals(extra.toUpperCase())){
                System.out.println(getBurgerName()+" Burger --> "+price+"\n" + "Extra --> "+ additional.getName()+ "\nTotal --> "+(price+additional.getPrice()));
            }
        }
    }

}
