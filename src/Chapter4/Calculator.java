package Chapter4;

public class Calculator {
    public static int factorial(int number) {
        int result = number;
        for (int i = number - 1; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
