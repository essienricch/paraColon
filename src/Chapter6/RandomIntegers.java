package Chapter6;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomValues = new SecureRandom();
        System.out.printf("%s%n","random values: ");
        for (int count=1; count <=30; count++){
            int face = 1 + randomValues.nextInt(6);
            System.out.printf("%d",face);

            if (count % 3== 0){
            System.out.println();
            }
        }
    }
}
