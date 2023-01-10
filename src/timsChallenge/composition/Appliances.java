package timsChallenge.composition;

import java.util.List;

public class Appliances {

    private List <String> name;

    public Appliances(List<String> name) {
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }

    public void isOn(String  name){
        if (getName().contains(name)){
            System.out.println(name + " is on.");
        }
    }
    public void isOff(String  name){
        if (getName().contains(name)){
            System.out.println(name + " is off.");
        }
    }

}
