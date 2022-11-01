package Chapter3;


import java.util.Scanner;

class PetrolPurchaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetrolPurchase petrolpurchase = new PetrolPurchase();
        System.out.println("Welcome to Total Filling Station, Enter branch name: ");
        String name = scanner.nextLine();
        petrolpurchase.setStationLocation(name);
        System.out.println("Hello, Welcome to Total Filling station " +petrolpurchase.getStationLocation() +" Branch");
        System.out.println("Enter your choice of petrol type: ");
        String petrol = scanner.nextLine();
        petrolpurchase.setPetrolType(petrol);
//        System.out.println();
        System.out.println("Enter price of "+petrolpurchase.getPetrolType() +" per litre: ");
        int price = scanner.nextInt();
        petrolpurchase.setPricePerLitre(price);
        System.out.println("The price per litre of " +petrolpurchase.getPetrolType()+ " is: "+petrolpurchase.getPricePerLitre());

        System.out.println("Discount per litre of "+petrolpurchase.getPetrolType()+ " is: "+petrolpurchase.getPercentageDiscount());

        System.out.println("Enter quantity purchased in litre: ");
        int quantity = scanner.nextInt();
        petrolpurchase.setPurchaseQuantity(quantity);
        System.out.println("Quantity purchased in litre: "+petrolpurchase.getPurchaseQuantity());
        System.out.println("The net purchased amount: "+ petrolpurchase.getPurchaseAmount());

    }

}