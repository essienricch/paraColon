package MyPractice;


public class ElementTypes {

    public static int lenghtOfWord(String word){
        int count= 0;
        int i;
        for (i = 0; i < word.length(); i++){
            if (Character.isDigit(word.charAt(i))){
                count++;
            }
        }return count;
    }
}
