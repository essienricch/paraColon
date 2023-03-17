package MyPractice.pointOfSale;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Money ego = new Money(new BigDecimal("2000.0"),"USD");
        Money ego1 = new Money(new BigDecimal("200"),"USD");
        Money ego2 = new Money(new BigDecimal("250"),"USD");
        Receipt receipt = new Receipt(p);
        receipt.addStocks("lingerie",ego);
        receipt.addStocks("pant",ego1);
        receipt.addStocks("dildo",ego2);
        receipt.print();
        System.out.println("The items purchased is "+receipt.totalItems() + ". \nTotal Price --> "+receipt.getTotal());

    }
}
