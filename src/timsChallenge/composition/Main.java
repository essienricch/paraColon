package timsChallenge.composition;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Furniture parlorFurniture = new Furniture(List.of(new String[]{"sofa chairs", "centre-tables", "dinning tables"}));
        Furniture bedroomFurniture = new Furniture(List.of(new String[]{"closet","bed","chairs"}));
        Door parlorDoor = new Door("brown", true);
        Appliances roomAppliance = new Appliances(List.of(new String[]{"fan", "AC"}));
        Appliances parlorAppliance = new Appliances(List.of(new String[]{"tv", "radio set","air-conditions","fridge","freezer","battery"}));
        Kitchen kitchen = new Kitchen(new Utensil(List.of(new String[]{"cutlery","pots","paltes","kettle"})),new Items(List.of(new String[]{"Rice","Beans","Garri","other items"})),new Furniture(List.of(new  String[]{"cupboards"})),new Door("brown",true),parlorAppliance);
        Bedroom bedroom = new Bedroom(1,1,bedroomFurniture,new Door("brown",true),roomAppliance);

        Home myHome = new Home("Aguda Lga", "Apartment", parlorFurniture,bedroom, parlorDoor,kitchen,1,parlorAppliance);
        myHome.getDoors().setLock();
        System.out.println( myHome.getBedrooms().toString().toLowerCase());
        myHome.getBedrooms().getAppliances().isOn("fan");
    }
}
