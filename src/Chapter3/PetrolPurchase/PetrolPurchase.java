package Chapter3.PetrolPurchase;


public class PetrolPurchase {

        private String stationLocation;
        private String petrolType;
        private int purchaseQuantity;
        private double pricePerLitre;
        private double percentageDiscount;

//   public PetrolPurchase(String stationLocation,String petrolType,int purchaseQuantity,double pricePerLitre,double percentageDiscount){
//       this.stationLocation = stationLocation;
//       this.petrolType = petrolType;
//       this.purchaseQuantity = purchaseQuantity;
//       this.pricePerLitre = pricePerLitre;
//       this.percentageDiscount = percentageDiscount;
//   }

   public void setStationLocation(String location){
       this.stationLocation = location;
   }
   public String getStationLocation(){
       return stationLocation;
   }
   public void setPetrolType(String type){
       this.petrolType = type;
   }
   public String getPetrolType(){
       return petrolType;
   }
   public void setPurchaseQuantity(int quantity){
       this.purchaseQuantity = quantity;
   }
   public int getPurchaseQuantity(){
       return purchaseQuantity;
   }
    public void setPricePerLitre(double price) {
        this.pricePerLitre = price;
    }
    public double getPricePerLitre(){
       return pricePerLitre;
    }
    public void setPercentageDiscount(){
       this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
       this.percentageDiscount = pricePerLitre/100;
       return percentageDiscount;
    }
    public double getPurchaseAmount(){
       double netAmount = ((purchaseQuantity * pricePerLitre) - percentageDiscount);
       return netAmount;
    }
}
