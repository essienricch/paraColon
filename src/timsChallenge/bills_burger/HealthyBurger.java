package timsChallenge.bills_burger;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger{

    private List <Additional> additionals;

    public HealthyBurger(String burgerName, boolean meat) {
        super(burgerName, "Brown Rye", meat);
        this.additions = new ArrayList<>(2);
    }


}
