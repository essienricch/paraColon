package MyPractice.pointOfSale;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Receipt {

    private final Printer printer;
    private final List <Item> items;

    public Receipt(Printer printer) {
        this.printer = printer;
        this.items = new ArrayList<>();
    }

    public void addStocks(String description, BigDecimal price, String currency){
        items.add(new Item(description,new Money(price,currency)));
    }


    public void addStocks(String description, Money money){
        items.add(new Item(description,money));
    }

    public double getTotal(){
        double total = 0.0;
        for (Item item: items){
            total += item.getPrice();
        }
        return total;
    }

    public int totalItems(){
        return items.size();
    }

    public void print(){
        items.forEach(item -> item.print(printer));
    }


}
