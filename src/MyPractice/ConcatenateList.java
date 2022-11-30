package MyPractice;

import java.util.ArrayList;

public class ConcatenateList {

    public static String [] addTwoArray(String[] numb, String[] letter){
        ArrayList <String> sum = new ArrayList<>();
        for (int i = 0; i < numb.length; i++) {
            sum.add(i, numb[i]);
            sum.add(letter[i]);
        } String [] joint = new String[sum.size()];
        for (int i = 0; i < sum.size(); i++) {
            joint[i] = sum.get(i);
        }return joint;
    }
}
