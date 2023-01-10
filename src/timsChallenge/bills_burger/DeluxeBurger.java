package timsChallenge.bills_burger;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Hamburger{

    private List <Additional> additions;

    public DeluxeBurger(Additional additions){
        super();
        this.additions = new ArrayList<>(2);
    }

    public void addExtras(){
        additions.add(new Additional("CHIPS",5.00));
        additions.add(new Additional("DRINKS",5.00));
    }
}
