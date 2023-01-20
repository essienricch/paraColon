package chapter15.printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example1 {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\printWriter\\print.txt"))
        {
            writer.print("Made in Lagos is goated");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
