package Chapter4.palindromes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public boolean sameViewFromReverseWord(String word) {
        int number = word.length();
        StringBuilder reverse = new StringBuilder();
        List <String> reversed = new ArrayList<>();
        for (int i = number-1; i >= 0; i--) {
            reversed.add(String.valueOf(word.charAt(i)));
        }
        for (String s : reversed) {
            reverse.append(s);
        }
        if(reverse.toString().equals(word)){
            System.out.println("The word is Palindrome");
            return true;
        }else{ System.out.println("Word is not Palindrome");
            return false;
        }
    }

    public boolean sameViewFromReverseNumber(int number) {
        StringBuilder reversed = new StringBuilder();
        List <String> reverse = new ArrayList<>();
        String word = Integer.toString(number);
        for (int i = word.length()-1; i >= 0; i--) {
            reverse.add(String.valueOf(word.charAt(i)));
        } for (String s : reverse) {
            reversed.append(s);
        }int reversal = Integer.parseInt(String.valueOf(reversed));
        System.out.println(reversal);
        if (reversal == number){
            System.out.println("The word is Palindrome");
            return true;
        }else {
            System.out.println("Word is not Palindrome");
            return false;
        }
    }
}
