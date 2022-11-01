package MyPractice;

public class Arrays {

    int [] numbers;

    public static int addSet(int [] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
           sum  += numbers[i];
        }
        return sum;
    }

    public static int minValue(int [] numbers){
       int min = numbers[0];
        for (int count = 0; count < numbers.length-1; count++){
            if (numbers[count] < min){
                min = numbers[count];
            }
        }
        return min;
    }

    public static int maxValue(int [] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

}
