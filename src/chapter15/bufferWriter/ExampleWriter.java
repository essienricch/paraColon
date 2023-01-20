package chapter15.bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ExampleWriter {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\bufferWriter\\flexes.txt")
        )){
            bufferedWriter.write("Success is God");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
