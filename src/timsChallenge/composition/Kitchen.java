package timsChallenge.composition;

public class Kitchen {

    private Utensil utensil;
    private Items items;
    private Furniture furniture;
    private Door door;
    private Appliances appliances;

    public Kitchen(Utensil utensil, Items items, Furniture furniture, Door door, Appliances appliances) {
        this.utensil = utensil;
        this.items = items;
        this.furniture = furniture;
        this.door = door;
        this.appliances = appliances;
    }
}
