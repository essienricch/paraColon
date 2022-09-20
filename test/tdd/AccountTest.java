package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    public void depositMoneyTest(){
        //given i have an account
        Account utibeAccount= new Account();
        //deposit 5000
        utibeAccount.deposit(5000);
        //check balance increases by 5000
        double balance = utibeAccount.balance();
        assertEquals(5000, balance);

    }
    @Test
    public void negativeDepositShouldNotWork(){
        //given i have an account
        Account utibeAccount = new Account();
        //given that i deposit 10000
        utibeAccount.deposit(10000);
        //check balance is 10000
        double balance = utibeAccount.balance();
       assertEquals(10000, balance);
       //when i deposit -5000
        utibeAccount.deposit(5000);
        //check that balance is 10000
        balance = utibeAccount.balance();
        assertEquals(15000, balance);
    }

    @Test
    public void withdrawalTest(){
        Account utibeAccount = new Account();
        utibeAccount.deposit(5_000);
        utibeAccount.withdraw(6_000);
        double balance = utibeAccount.balance();
        System.out.println("GOD ABEGG");
        assertEquals(5_000, balance);

    }

}