package tdd;

public class Account {
    private int balance;
    private String name;

    public void deposit(int amount) {

        if (amount > 0) balance = balance + amount;

    }

    public int balance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > balance);
        balance= balance;

    }



}
