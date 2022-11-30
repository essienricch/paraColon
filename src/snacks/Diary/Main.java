package snacks.Diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Diary diary;

   static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }



    private static void createDiary() {
        String mainMeme = """
                Diary Dairy Diary!!!
                Where Memory Lives
                
                """;
        System.out.println();
        print(mainMeme);

        String name = input("Enter your name: ");
        String pass = input("Enter your Password: ");
        diary = new Diary(name, pass);
        System.out.println("Diary created for: " + name);
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
//            print(prompt);
//            return keyboardInput.nextLine();
        }

        private static void print(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
           // System.out.println(prompt);
        }

        private static void displayLockMenu(){
            String main = """
                    Press
                    1 --> Unlock Diary
                    2 --> Lock Diary
                    3 --> Exit
                    """;
            String userInput = input(main);
                switch (Integer.parseInt(userInput)) {
                    case 1 -> unlockDairy();
                    case 2 -> lockDiary();
                    case 3 -> exitApplication();
                }
        }

    private static void lockDiary() {
        diary.lock();
        print("Locked successfully");
        displayLockMenu();

    }

    private static void unlockDairy() {
        String pass =input("Enter correct Password");
        diary.unLockWith(pass);
        if (diary.isLocked()){
            print("Wrong password");
            displayLockMenu();
        }else {
            displayDairyMenu();
        }
    }

    private static void displayDairyMenu() {
        String diaryMenu = """
                Press 1 --> Create Entry
                Press 2 --> Find Entry by ID
                Press 3 --> Get total number of entries
                Press 4 --> Lock diary
                """;

        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1: createEntry();
            case 2: findByID();
            case 3: getTotalNumberOfEntries();
            case 4: lockDiary();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberofEntry = diary.numberOfEvents();
        print("You have "+totalNumberofEntry + " Entries");
        displayDairyMenu();
    }

    private static void findByID() {
        String id = input("Enter the id for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDairyMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title,body);
        print("Written Successfully");
        displayDairyMenu();
    }

    private static void exitApplication(){
        print("Tanks for using our application");
        System.exit(0);
    }
}

