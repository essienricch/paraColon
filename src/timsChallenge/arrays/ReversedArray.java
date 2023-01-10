package timsChallenge.arrays;

public class ReversedArray {

    public static int [] reverenceReverse(int [] number){
        int [] reversed = new int[number.length];
        for (int i = 0, j = reversed.length-1; i < number.length; i++,j--) {
            reversed[j] = number[i];
        }return reversed;
    }
}
