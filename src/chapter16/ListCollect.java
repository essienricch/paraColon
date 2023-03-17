package chapter16;

import java.util.*;

public class ListCollect {
    public static void main(String[] args) {
        List <Integer> numbers = new Vector<>();
        numbers.add(22);
        numbers.add(44);
        numbers.add(66);
        numbers.add(88);

        System.out.println("numbers:: "+numbers);

        System.out.println();
        List <Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(22);
        integers.add(56);
        integers.add(89);
        integers.add(77);
        System.out.println("integers:: "+  integers);
        System.out.println("Does numbers contains integers:: "+numbers.containsAll(integers));
        System.out.println("Element at index 2 in integer list:: "+integers.get(2));
        System.out.println("index of element 1 in number list:: "+numbers.indexOf(44));

        ListIterator <Integer>  numb_interator = integers.listIterator();
        while ( numb_interator.hasPrevious()){
             numb_interator.remove();
            System.out.println( numb_interator.hasNext());

        }
        System.out.println();
        Spliterator <Integer> numberspliterator = numbers.spliterator();
        System.out.println("number:: "+numbers);
        System.out.println();
        Spliterator <Integer> spliterator = numberspliterator.trySplit();
        System.out.println(spliterator.estimateSize());
        spliterator.forEachRemaining(System.out::println);

    }
}
