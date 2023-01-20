package chapter16;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {
//        List <String> words = new ArrayList<>();
//        words.add("Semicolon");
//        words.add("Obidient");
//        words.add("Atikulate");
//        words.add("Batified");
//        words.add("Kwankasolite");
//
//
//        System.out.println(words);
//        //System.out.println(Arrays.deepToString(words.toArray()));

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

        Iterator <Integer> iterator = numb.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
