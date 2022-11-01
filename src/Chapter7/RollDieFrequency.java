package Chapter7;

import java.security.SecureRandom;

public class RollDieFrequency {
    static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        int [] freq = new  int [7];

        System.out.printf("%s%15s%n","FACE","FREQUENCY");

        for (int roll = 1; roll < 60_000_000; roll++ ){
            ++freq[1 + random.nextInt(6)];
        }

        for (int face = 1; face < freq.length; face++){
            System.out.printf("%n%d%15d",face,freq[face]);
        }


    }
}
