package Chapter7;

public class ArrayInitz {
    public static void main(String[] args) {
        int total = 0;
        int[] wiz = new int[10];
        System.out.println("Index\t\tValue");
        for (int count = 0; count < wiz.length; count++){
            wiz[count] = 2 + 2 * count;

            System.out.printf("%n%d%15d",count,wiz[count]);
        }
        for (int count =0; count < wiz.length; count++){
            total += wiz[count];
        }
        System.out.println();
        System.out.println("\nSum of Array Wiz: "+total);
    }
}
