package Chapter6;

import java.security.SecureRandom;

public class SixpointTwelve {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int a = 2 + random.nextInt(6);
        int b = 4 + random.nextInt(50);
        int c = 1 + random.nextInt(7);
        int d = 1000 + random.nextInt(1030);
        System.out.printf("The following displays random numbers: %d\t%d\t%d\t%d",a, b, c, d);

    }
}
