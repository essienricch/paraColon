package chapter15.filepath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("src/chapter15/filepath/chuk.txt.");
        Path path1 = Paths.get("C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\filepath");
        //Path path2 = Paths.get("");
        Path currentDirectory = Paths.get("").toAbsolutePath();
        //System.out.println(currentDirectory);
        Path target = Paths.get("C:\\Users\\New Owner\\IdeaProjects\\paraColon\\src\\chapter15\\Output.txt");
        Path relative = currentDirectory.relativize(target);
        System.out.println(relative);
        System.out.println(path.getFileSystem());

        //TODO: CHECK TO SEE IF PATH POINTS TO A DIRECTORY ==>
        System.out.println(relative.getFileName());
        System.out.println("is directory:: "+ Files.isDirectory(relative));
        System.out.println("Exists:: "+Files.exists(relative));

//        try{
//            System.out.println("Hidden? "+Files.isHidden(path));
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }

        try{
            System.out.println("Modified:: "+Files.getLastModifiedTime(relative));
        }catch (IOException e){
            e.printStackTrace();
            System.err.println("error:: " + e.getMessage());
        }
    }
}
