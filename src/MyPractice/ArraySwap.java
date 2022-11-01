package MyPractice;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {5,4,6,0,2};
        System.out.println(Arrays.toString(shiftArray(arr)));
    }

    public static int[] shiftArray(int [] myArray){
       int temp = 0;
//        for (int i = 1;i < myArray.length;i++){
//            myArray[i -1] = myArray[i] ;
//        }
//        myArray[myArray.length - 1] = temp;
//        return myArray;

        for (int i = 0; i < myArray.length; i++){
            for (int j = 1; j < myArray.length; j++){
                if (myArray[j] < myArray[i]){
                   temp = myArray[j];
                   myArray[j] = myArray[i];
                   myArray[i] = temp;

                }
            }
        }return  myArray;
    }
//    public static int[] shiftArr(){
//
//    }
}
