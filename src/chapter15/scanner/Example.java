package chapter15.scanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
       try(FileInputStream inputStream = new FileInputStream(
               "C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\scanner\\scanner.txt")){
        Scanner scanner = new Scanner(inputStream);
        String input = scanner.next();
           System.out.println("Program read :: "+ input);
       }catch (IOException e){
           System.err.println(e.getMessage());
       }
    }
}
