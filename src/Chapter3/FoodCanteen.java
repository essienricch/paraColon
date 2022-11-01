package Chapter3;

import java.util.Scanner;

public class FoodCanteen {
	Scanner input = new Scanner(System.in);

	private  String name;
	private double balance;
	private double price;
	private int count;
	private  int total;


	public FoodCanteen(String canteenName, double cardbalance) {
		name = canteenName;
		this.balance = cardbalance;

	}

	public String getCanteenName() {
		return name;
	}

	public void setPrice() {
		do {
			System.out.println("Enter price of purchased food: ");
			price = input.nextDouble();
			if (price > 0.0) {
				balance = balance - price;
				System.out.println("");
				System.out.println("Successful transaction!!! \n Thank you for patronage ");
				break;
			} else{
				System.out.println("Invalid input, Enter a valid amount ");
			count++;
			}
		}
		while (count > 0);{
			 count++;
		}
	}
	public double getBalance() {
		return balance;
	}
}
