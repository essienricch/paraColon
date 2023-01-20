package chapter15.bufferRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRead {
    public static void main(String[] args) {
        try(BufferedReader  bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in))){

            System.out.println("Enter a string: ");
           String input =  bufferedReader.readLine();
            System.out.print("digits :: ");

            for (int count = 0; count < input.length(); count++) {
                if (input.charAt(count)== '_')
                    System.out.print(input.charAt(count + 1));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
