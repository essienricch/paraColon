package Chapter8.hugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private final int[] array = new int[40];
    private int numberLength;


    public void parse(String number) {
        numberLength = number.length();
        for (int i = 0; i < numberLength; i++){
            String character = Character.toString(number.charAt(i));
            array[i] = Integer.parseInt(character);
        }
    }

    @Override
    public String toString() {
        return "myHugeInteger2{" +
                "array=" + Arrays.toString(array) +
                ", numberLength=" + numberLength +
                '}';
    }
    public int add(int num1, int num2){
        return num1 + num2;

    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }


    public boolean isEqual(int num1, int num2){
        boolean check = false;
        if (num1 == num2){
            check = true;
        }
        return check;
    }
    public int[] getDigitArray() {

        return array;
    }

    public boolean isNotEqual(int num1, int num2) {
        boolean check = false;
        if(num1 != num2){
            check = true;
        }
        return check;
    }

    public boolean isGreaterThan(int num1, int num2){
        boolean check = false;
        if(num1 > num2){
            check = true;
        }
        return check;
    }

    public boolean isLessThan(int num1, int num2){
        boolean check = false;
        if (num1 < num2){
            check = true;
        }
        return check;
    }

    public boolean isGreaterThanOrEqualTo(int num1, int num2){
        boolean check = false;
        if (num1 >= num2){
            check = true;
        }
        return check;
    }

    public boolean isLessThanOrEqualTo(int num1, int num2){
        boolean check = false;
        if (num1 <= num2){
            check = true;
        }
        return check;
    }
}
