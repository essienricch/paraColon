package TimsChallenge.Arrays;

import java.util.Arrays;

public class MinElement {

private static int [] timArray;
    public static int [] setArraySize(int number) {
        timArray = new int[number];
        return timArray;
    }


    public static int [] getIntegers(int numbers) {
        int i = 0;
        for (int index = 0; index < timArray.length; index++) {
            timArray[index] = numbers * index;
        }
       return timArray;
    }

    public static int findMinimum(int [] number) {
      timArray =  Arrays.copyOf(number,number.length);
        int minimum;
        minimum = timArray[0];
        for (int num : timArray){
            if (num < minimum){
                minimum = num;
            }
        }return minimum;
    }
}
