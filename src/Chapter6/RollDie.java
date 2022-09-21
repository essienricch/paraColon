package Chapter6;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom views = new SecureRandom();
        int frequency1 = 0;
        int frequency2 =0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 =0;
        int frequency6 =0;

        for (int count=1; count<=60_000_000; count++){
            int beep = 1 + views.nextInt(6);
          switch (beep){
              case 1:
                  ++frequency1;
                break;
              case 2:
                  ++frequency2;
                  break;
              case 3:
                  ++frequency3;
                  break;
              case 4:
                  ++frequency4;
                  break;
              case 5:
                  ++frequency5;
                  break;
              case 6:
                  ++frequency6;
                  break;
          }
        }

        System.out.printf("%s\t%s%n","counter","frequency");
        System.out.printf("1%15d%n2%15d%n3%15d%n4%15d%n5%15d%n6%15d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
    }
}
