package Chapter4;

public class TabularOutput {
    public static int rootOfValue(int endPoint) {
        int square = 0;
        System.out.printf("%s","N(2)");
        for (int i = 1; i <= endPoint; i++) {
            square = i * i;
            System.out.printf("%n%d",square);
        }return square;
    }

    public static int tripleRoot(int endPoint) {
        int triple = 0;
        System.out.printf("%n%s%n","N(3)");
        for (int i = 1; i <= endPoint; i++){
            triple = i*i*i;
            System.out.printf("%d%n",triple);
        }return triple;
    }

    public static int singleOutput(int endPoint) {
        int value = 0;
        System.out.println("N");
        for (int i = 0; i <= endPoint; i++) {
            System.out.println(i);
        }return endPoint;
    }

    public static int quadrupleValue(int endPoint) {
        int quadruple = 0;
        System.out.println("N(4)");
        for (int i = 0; i <= endPoint; i++) {
            quadruple = i * i * i * i;
            System.out.println(quadruple);
        }return quadruple;
    }
}
