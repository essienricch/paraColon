package chapter16;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(44);

        List<Integer> numbers = new Vector<>();
        numbers.add(22);
        numbers.add(44);
        numbers.add(66);
        numbers.add(88);
        numbers.add(13);
        numbers.add(45);
        numbers.add(24);

        System.out.println("numbers:: "+numbers);

        //numbers.removeAll(set);

        System.out.println("numbers after removal of the set value:: "+numbers);
        numbers.remove(1);
        System.out.println("number after removing index at 1:: "+ numbers);
        System.out.println();


        System.out.println("number before sorting:: "+numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("number after sorting:: "+numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("number after sorting in a reverse order:: "+numbers);
        System.out.println();

        Set <String> states = new HashSet<>();

        states.add("kebbi");
        states.add("Abia");
        states.add("Aks");
        states.add("Cross-river");
        states.add("Jigawa");
        states.add("Zamfara");

        System.out.println(states);

    }
}
