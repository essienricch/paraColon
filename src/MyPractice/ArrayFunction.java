package MyPractice;

public class ArrayFunction {

    public static int [] swapArray(int [] numb){
       int [] revNumb = new int[numb.length];
        for (int i = 0, j = numb.length-1; i < numb.length; i++, j--) {
            revNumb[j] = numb[i];
        }return revNumb;
    }
}
