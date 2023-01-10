package Chapter3.Car;


import java.util.Scanner;

class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            Car car = new Car("Mercedes Benz","2022",15500000.00);
            Car car1 = new Car("BENTLEY","2021",20_000_000.00);

        System.out.println("WELCOME TO ESSIEN CAR HUB \n");
        System.out.println("Enter name of car model: ");
        String name = scanner.nextLine();
        car.setModel(name);
        System.out.println("Enter year of car model: ");
        String year = scanner.nextLine();
        car.setYear(year);
        System.out.println("Enter price of Car: ");
        double price = scanner.nextDouble();
        car.setPrice(price);
        System.out.println("Enter discount amount for the car: ");
        int amount = scanner.nextInt();
        car.setDiscount(amount);
        System.out.printf("%s%.2f%s%.3f%s%s%s%s%n","After discount of ",car.getDiscount(), " given. The new price of ",car.getPrice()," for ",car.getModel()," ",car.getYear());

        System.out.printf("%s%.2f%s%s%s%s%n","Make a payment of ",car.getPrice(), " for the ", car.getModel()," ",car.getYear());
//        System.out.println("You made a payment of "+car1.getPrice()+ " for "+car1.getModel()+" "+car1.getYear());
        System.out.println();
        System.out.println("Enter name of car model: ");
         name = scanner.next();
        car1.setModel(name);
        System.out.println();
        System.out.println("Enter year of car model: ");
         String year1 = scanner.next();
        car1.setYear(year1);
        System.out.println();
        System.out.println("Enter price of Car: ");
       price = scanner.nextDouble();
        car1.setPrice(price);
        System.out.println();
        System.out.println("Enter discount amount for the car: ");
       amount = scanner.nextInt();
        car1.setDiscount(amount);
        System.out.printf("%n%s%.2f%s%.3f%s%s%s%s%n","After discount of ",car1.getDiscount(), " given. The new price of ",car1.getPrice()," for ",car1.getModel()," ",car1.getYear());

        System.out.printf("%s%.2f%s%s%s%s","Make a payment of ",car1.getPrice(), " for the ", car1.getModel()," ",car1.getYear());


//        System.out.printf("%s%.2f%s%.3f%s%s%s%s%n%s","After discount of ",car1.getDiscount(), " given. you made a payment of ",car1.getPrice()," for ",car1.getModel()," ",car1.getYear()," Thank you for your patronage, We hope to do more business with you.");

    }
}