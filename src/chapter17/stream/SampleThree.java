package chapter17.stream;

import java.util.List;

public class SampleThree {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1,2,3,4,5, 6);
        System.out.println(numbers.stream()
                .reduce((x, y) -> x * y).orElse(0));
    }
}
