package snacks;

public class NaturalNumbers {
    public static void main(String[] args) {
        int total = 0;
        int count;
        for (count=1; count <= 10; count++){
           total =total + count;
            System.out.printf(count+ " ","%n");
        }
        System.out.printf("%nSum of first ten natural numbers: " +total);
    }
}
