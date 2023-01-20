package chapter15.filepath;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\New Owner\\Documents");
        System.out.println(path);

//        Path path1 = Paths.get(System.getProperty("file.separator")+"home","semicolon");
//        System.out.println(path1);
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(content -> System.out.println(content.getFileName()));
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
