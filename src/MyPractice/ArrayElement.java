package MyPractice;

import java.util.ArrayList;

public class ArrayElement {

    public static int [] oddValues(int [] number){
        ArrayList <Integer> oddBox = new ArrayList<>();
        int [] odd = new int[3];
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1){
            oddBox.add(number[i]);}
        }
        for (int i = 0,j=0; i < oddBox.size(); i++,j++) {
            odd[j] = oddBox.get(i);
        }
        return odd;
    }
}
