package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExampleOne {
    public static void main(String[] args) {
       try {
           PrintStream printStream = new PrintStream("/C:/Users/New Owner/IdeaProjects/paraColon/src/chapter15/Output.txt/");
           printStream.println("Save my soul!!! ");
       }catch (FileNotFoundException exception){
           System.out.println(exception.getMessage());
       }


    }
}
