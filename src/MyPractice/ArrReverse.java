package MyPractice;

public class ArrReverse {
    public static int[] reverse(int[] reversedNumb) {
        int [] reversed = new int[reversedNumb.length];
        int backwardCounter = reversedNumb.length - 1;
        int forward = 0;
        while (backwardCounter != -1){
            reversed[forward++] = reversedNumb[backwardCounter--];
        }
            return reversed;
    }

    public static String reverse(String userInput) {
        String reversedString = "";
        int backwardCounter = userInput.length() -1;
        while (backwardCounter != -1){
            reversedString += userInput.charAt(backwardCounter--);
        }
        return reversedString;
    }

    public static String oneLineReverse(String userInput){

        return new StringBuilder(userInput).reverse().toString();
    }


    public static String toSentenceCase(String userInput) {
        String firstLetter = (""+ userInput.charAt(0)).toUpperCase();
        String otherLetters = "";
        for (int i = 1; i < userInput.length(); i++) {
            otherLetters += userInput.charAt(i);
        }
        return  firstLetter+otherLetters.toLowerCase();
    }
}
