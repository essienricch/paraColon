package Chapter7;

import java.util.Scanner;

public class ArrayMethod {
    //... elipses houses multiple values
    public static int addNumbers(int...numbers){
        int total =0;
        for (int count=0; count <= 6; count++){
            total += numbers[count];
        }return total;
    }


   // private static  int [] numbers ={10,7,8,5,6};

//    public static int addNumbers(int[]numbers){
//        int total = 0;
//        for(int count : numbers){
//       // for (int count = 0; count < numbers.length; count++){
//           total +=  count;
//        }
//        return total;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //   System.out.println("Enter a digit: ");
       // int number = input.nextInt();
        System.out.println(addNumbers(12,23,45,55,78,90,100));

    }
}
