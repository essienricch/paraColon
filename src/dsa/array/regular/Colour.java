package dsa.array.regular;

import java.util.Arrays;

public class Colour {
    public static void main(String[] args) {

        String [] colors = new String[5];
        colors[0] = "black";
        colors[1] = "grey";
        colors[2] = "green";
        colors[3] = "turpine";
        colors[4] = "red";

        for (String color : colors){
            System.out.print(color +", ");
        }System.out.println();

        Arrays.stream(colors).forEach(System.out::println);
    }
}
