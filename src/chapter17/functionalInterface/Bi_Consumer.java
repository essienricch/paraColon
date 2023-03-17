package chapter17.functionalInterface;

import java.util.function.BiConsumer;

public class Bi_Consumer {
    public static void main(String[] args) {
        BiConsumer <String , Integer> biConsumer = Bi_Consumer :: doAccept;
        biConsumer.accept("rich",10);
    }

    private static void doAccept(String name, Integer age) {
        System.out.println("we are paragons");
        System.out.println("i love java");
        System.out.println("life at " +age + " is good for "+name);
    }
}
