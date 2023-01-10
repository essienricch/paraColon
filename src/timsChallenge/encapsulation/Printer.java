package timsChallenge.encapsulation;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int toner){
        if (toner > 0 && toner <= 100 ){
            tonerLevel = toner;
        }else System.out.println("Toner level too low, Printer cant be used");
    }

    public void simulatePrinting(int pagesToBePrinted, boolean duplicated){
        if (tonerLevel > 0 && pagesToBePrinted > 1){
            numberOfPagesPrinted = pagesToBePrinted;
        }else if (tonerLevel > 0 && pagesToBePrinted == 1){
            duplexPrinter = true;
            System.out.println("Printed in both sides");
        }else System.out.println("Not enough toner to print.");
    }


}
