package Chapter4;

public class Vshaped {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //for (int j = 1; j <= i - 1; j++) {
             //   System.out.print("  ");
            //}
            for (int k = 1; k <= 11-3 * i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
