package MyPractice.pointOfSale;

import java.math.BigDecimal;

public class Money {

    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getTotal(){
        return amount.doubleValue();
    }

    public void print(Printer printer){
        printer.print(currency);
        printer.print(amount.toPlainString());
        printer.plainPrint();
    }
}
