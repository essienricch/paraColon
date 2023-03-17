package chapter17.stream;

import java.util.Set;
import java.util.stream.Collectors;

public class SampleTwo {
    public static void main(String[] args) {
        Set <Employee> employees = Set.of(new Employee("ishaya", 20),
                new Employee("adufe", 25),
                new Employee("jamila", 19));

        System.out.println(employees);

        System.out.println(employees.stream().sorted().collect(Collectors.toList()));
    }
}
