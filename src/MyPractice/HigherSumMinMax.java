package MyPractice;

public class HigherSumMinMax {
   static int sum = 0;
  static   int fore = 0;
     static  int [] newNumbs = new int[5];

//    public static void highersum(int [] numbers){
//        int i;
//        for (i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        for (int k = 0; k < newNumbs.length; k++) {
//            newNumbs[fore++] = sum - numbers[k];
//        }
//        for (int count = 0; count < newNumbs.length; count++){
//            System.out.println(newNumbs[count]);
//        }
//    }

    public static int minHigh(int [] numbers){
        int i;
        for (i = 0; i < numbers.length-1; i++) {
            sum += numbers[i];
        }
        for (int k = 0; k < newNumbs.length-1; k++) {
            newNumbs[fore++] = sum - numbers[k];
        }

        int min = newNumbs[0];
        for (int j = 0; j < newNumbs.length-1; j++){
            if (newNumbs[j] < min){
                min = newNumbs[j];
            }
        }return min;
       // System.out.println("min is: " + min);
    }

    public static int maxHigh(int [] numbers){
        int i;
        for (i = 0; i < numbers.length-1; i++) {
            sum += numbers[i];
        }
        for (int k = 0; k < newNumbs.length-1; k++) {
            newNumbs[fore++] = sum - numbers[k];
        }

        int max = newNumbs[0];
        for (int j = 0; j < newNumbs.length-1; j++){
            if (newNumbs[j] > max){
                max = newNumbs[j];
            }
        }//System.out.println("max is: " + max);
        return max;
    }
}
