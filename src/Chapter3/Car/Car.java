package Chapter3;

import java.util.Scanner;

public class Car {

    private String model;
    private String year;
    private double price;
    int count = 0;
    private double discount;
    Scanner scanner = new Scanner(System.in);


    public Car(String model,String year,double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void setModel(String name){
        this.model = name;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double amount){
        int total =0;

        do {
            if (amount > 0.0){
                this.price = amount;
                break;
            }else {
                System.out.println("Enter a valid amount: ");
                amount = scanner.nextDouble();
            }count++;
        }while (count>0);{
            total += count;
//            System.out.println("Enter a valid amount: ");
//            amount = scanner.nextDouble();
        }
    }
    public double getPrice(){
        return price - discount;
    }
    public void setDiscount(int discount){
        this.discount = (double) discount / 100;
    }
    public double getDiscount(){
       discount = price * discount;
        return discount;
    }
}
