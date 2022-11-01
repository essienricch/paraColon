package Chapter6;

import java.security.SecureRandom;

public class SixpointThirteen {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int a = 1 + 3 * random.nextInt(12);
        int b = 1 + 8 * random.nextInt(32);
        int c = 10 + 10 * random.nextInt(40);
        System.out.println("random display of integer A: "+a);
        System.out.println();
        System.out.println("random display of integer B: "+b);
        System.out.println();
        System.out.println("random display of integer C: "+c);
    }
}
