package Chapter7;

public class ArraySum {
    public static void main(String[] args) {
        int [] number = {12,16,27,37,54};
        int sum = 0;
        for (int count=0; count < number.length; count++){
            sum +=  number[count];
        }
        System.out.println("sum of number: "+ sum);
    }
}
