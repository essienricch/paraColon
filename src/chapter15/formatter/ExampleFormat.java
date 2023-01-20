package chapter15.formatter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ExampleFormat {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String patch = "More Love, Less Ego ";


        try(Formatter formatter = new Formatter(
                "format.txt");
            Scanner scanner = new Scanner(
                    new FileInputStream("C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\printWriter\\print.txt"))){

            String str =scanner.nextLine();
            formatter.format("File content updated from %s to %s", str, builder.append(patch));
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
