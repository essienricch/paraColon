package chapter15.bufferRead;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(BufferRead2.class);
        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:/Users/New Owner/IdeaProjects/paraColon/src/chapter15/Output.txt")
        )){
            System.out.println(bufferedReader.readLine());
        }catch (IOException e){
            System.err.println("exception msg :: " + e.getMessage());
        }
    }
}
