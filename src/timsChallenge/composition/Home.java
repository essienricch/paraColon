package timsChallenge.composition;


public class Home {

    private String homeAddress;

    private String homeModel;
    private Furniture furnitures;
    private Bedroom bedrooms;
    private Door  doors;
    private Kitchen kitchen;
    private int storeRoom;
    private Appliances appliances;

    public Home(String homeAddress, String homeModel, Furniture furnitures, Bedroom bedrooms, Door doors, Kitchen kitchen, int storeRoom, Appliances appliances) {
        this.homeAddress = homeAddress;
        this.homeModel = homeModel;
        this.furnitures = furnitures;
        this.bedrooms = bedrooms;
        this.doors = doors;
        this.kitchen = kitchen;
        this.storeRoom = storeRoom;
        this.appliances = appliances;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeAddress='" + homeAddress + '\'' +
                ", homeModel='" + homeModel + '\'' +
                ", furniture's=" + furnitures +
                ", bedrooms=" + bedrooms +
                ", doors=" + doors +
                ", kitchen=" + kitchen +
                ", storeRoom=" + storeRoom +
                ", appliances=" + appliances +
                '}';
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getHomeModel() {
        return homeModel;
    }

    public Furniture getFurnitures() {
        return furnitures;
    }

    public Bedroom getBedrooms() {
        return bedrooms;
    }

    public Door getDoors() {
        return doors;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public int getStoreRoom() {
        return storeRoom;
    }

    public Appliances getAppliances() {
        return appliances;
    }
}
