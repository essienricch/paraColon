package chapter17.stream;

import chapter16.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleOne {
    public static void main(String[] args) {
        Function <Integer , Person> function =(age) -> new Person("silas", age);
        List <Integer> numbers = List.of(7,1,2,3,4,5);
        System.out.println(numbers.stream()
                .map(n -> n * n)
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


        // USING ARRAY:
        int [] numbs = {2,3,4,5,67};
        System.out.println(Arrays.stream(numbs).mapToObj(element -> buildPerson(element))
                .collect(Collectors.toList()));
    }

    private static Person buildPerson(int element){
        return new Person("Casamigos", element);
    }
}
