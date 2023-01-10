package MyPractice.pointOfSale;

import java.math.BigDecimal;

public class Item {

    private final String description;
    private final Money price;

    public Item(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public double getPrice(){
      return price.getTotal();

    }

    public void print(Printer printer){
        printer.print(description);
        price.print(printer);
    }

}
