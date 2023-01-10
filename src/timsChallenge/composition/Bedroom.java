package timsChallenge.composition;

public class Bedroom {

    private int toilet;
    private int bathroom;
    private Furniture furnitures;
    private Door door;
    private Appliances appliances;

    public Bedroom( int toilet, int bathroom, Furniture furnitures, Door door, Appliances appliances) {

        this.toilet = toilet;
        this.bathroom = bathroom;
        this.furnitures = furnitures;
        this.door = door;
        this.appliances = appliances;
    }

    public int getToilet() {
        return toilet;
    }

    public int getBathroom() {
        return bathroom;
    }

    public Furniture getFurnitures() {
        return furnitures;
    }

    public Door getDoor() {
        return door;
    }

    public Appliances getAppliances() {
        return appliances;
    }

    public String toString(){
        return "Bedroom " + getDoor().setLock();
    }
}
