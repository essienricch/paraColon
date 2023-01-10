package timsChallenge.arrays;

import java.util.Scanner;

public class ArrayChallenge {

    static Scanner input = new Scanner(System.in);

    public static int [] getIntegers(int [] myArray){
        for (int j : myArray) {
            System.out.println(j);
        }
        return myArray;
    }

    public static int [] sortInDescendOrder(int [] myArray) {
        boolean large = true;
        int temp;
        int [] sortArray = new int[myArray.length];

        System.arraycopy(myArray, 0, sortArray, 0, myArray.length);

        while (large){
            large = false;
            for (int i = 0; i < sortArray.length-1; i++){
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i + 1];
                    sortArray[i + 1] = sortArray[i];
                    sortArray[i] = temp;
                    large = true;
                }
            }
        }return sortArray;

    }

    public static int findMinimumElement(int [] array) {
        int minimum = array[0];
        for (int j : array) {
            if (j < minimum) {
                minimum = j;
            }
        }return minimum;
    }
}
