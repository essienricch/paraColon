package dsa.stackslist;

import java.util.Stack;

public class SampleOne {

    public static int stackSum(String [] arrayNumb, String operator) {
        int sum = 0;
        Stack <String> container = new Stack<>();
         if (arrayNumb == null ||operator == null){
             throw new IllegalArgumentException("THIS LIST IS EMPTY");
         }else{
             for (String value: arrayNumb){
                 if (!operator.contains(value)){
                     container.push(value);
                 }else {
                     int a = Integer.parseInt(container.pop());
                     int b = Integer.parseInt(container.pop());
                     switch (operator){
                         case "+":
                             sum = a + b;
                             break;
                         case "-":
                            sum = b - a;
                            break;
                         case "/":
                             sum = b / a;
                             break;
                         case "*":
                             sum = a * b;
                             break;

                     }  return sum;

                 }


             }
         }return Integer.parseInt(container.pop());
    }
}
