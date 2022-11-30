package MyPractice;

import java.util.ArrayList;

public class ArrayElementPositions {

    public static int [] oddPosition(int [] number){
        ArrayList <Integer> oddBox = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 1){
            oddBox.add(number[i]);}
        }
        int [] odd = new int[oddBox.size()];
        for (int i = 0,j=0; i < oddBox.size(); i++,j++) {
            odd[j] = oddBox.get(i);
        }
        return odd;
    }

    public static int[] evenPosition(int [] number) {
        ArrayList <Integer> evenBox = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0){
                evenBox.add(number[i]);}
        }
        int [] even = new int[evenBox.size()];
        for (int i = 0,j=0; i < evenBox.size(); i++,j++) {
            even[j] = evenBox.get(i);
        }
        return even;

    }
}
