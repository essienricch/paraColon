package chapter16;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {
        List <String> words = new ArrayList<>();
        words.add("Semicolon");
        words.add("Obidient");
        words.add("Atikulate");
        words.add("Batified");
        words.add("Kwankasolite");


       // System.out.println(words);
        System.out.println(Arrays.deepToString(words.toArray()));

        List <Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);

        int number = numbers.get(2);
        System.out.println(number);
        System.out.println(numbers);

        System.out.println();
        System.out.println("COLLECTIONS: ");

        Collection <Integer> numb = new ArrayList<>();
        numb.add(2);
        numb.add(5);
        numb.add(10);

        int minimum = Collections.min(numbers);
        System.out.println("Smallest beneath values:: "+Collections.min(numb));
        System.out.println("Largest beneath values:: "+Collections.max(numb));
        System.out.println();
        System.out.println("Smallest number top:: "+minimum);
        System.out.println("Largest number top:: "+Collections.max(numbers));

        Collection <Integer> numbersTwo = new ArrayList<>();
        numbersTwo.add(11);
        numbersTwo.add(22);
        numbersTwo.add(33);

        System.out.println("Elements in list numbersTwo:: "+numbersTwo);

        System.out.println();
        numbersTwo.addAll(numb);
        System.out.println("Elements in both list numbersTwo & Numb:: "+numbersTwo);

        System.out.println();
        Integer [] numberArray = new Integer[3];
        numbers.toArray(numberArray);
        System.out.println("Array to number:: "+ Arrays.toString(numberArray));




    }
}
