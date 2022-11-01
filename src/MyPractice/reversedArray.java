package MyPractice;

import java.util.Arrays;

public class reversedArray {

  public static int[] revArray(int[] number){
      int [] reversedNumber = new int[number.length];
      int fore = 0;
      for (int count = number.length - 1; count != -1; count--) {
            reversedNumber[fore++] = number[count];
      }
      return reversedNumber;
  }

    public static void main(String[] args) {
      int [] number = {9,8,7,6,5};
        System.out.println(Arrays.toString(revArray(number)));
    }
}
