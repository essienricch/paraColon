package MyPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MyerBriggs {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList <String> userChoice = new ArrayList<>();

   static int extrovertA = 0;
    static int introvertB = 0;

    static int sensingA = 0;
    static int ntuitiveB = 0;

    static int thinkingA = 0;
    static int feelingB = 0;

    static int judgingA = 0;
    static int percieveB = 0;




    public static void extIntrovert1(){
        char userInput = 0;
        System.out.printf("%s%15s","A. expend energy, enjoy groups ","B. conserve energy, enjoy one-on-one\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                extrovertA++;
                userChoice.add("A. expend energy, enjoy groups");
                break;
            }else if (userInput == 'B'){
                introvertB++;
                userChoice.add("B. conserve energy, enjoy one-on-on");
                break;
            }System.out.printf("%s%15s","A. expend energy, enjoy groups ","B. conserve energy, enjoy one-on-one\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void extIntrovert2(){
        char userInput = 0;
        System.out.printf("%s%15s","A. more outgoing, think out loud ","B. more reserved, think to yourself\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                extrovertA++;
                userChoice.add("A. more outgoing, think out loud");
                break;
            }else if (userInput == 'B'){
                introvertB++;
                userChoice.add("B. more reserved, think to yourself");
                break;
            }System.out.printf("%s%15s","A. more outgoing, think out loud ","B. more reserved, think to yourself\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void extIntrovert3(){
        char userInput = 0;
        System.out.printf("%s%15s","A. seek many tasks, public activities, interaction with others ","B. seek private, solitary activities with quiet to concentrate \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                extrovertA++;
                userChoice.add("A. seek many tasks, public activities, interaction with others");
                break;
            }else if (userInput == 'B'){
                introvertB++;
                userChoice.add("B. seek private, solitary activities with quiet to concentrate");
                break;
            }System.out.printf("%s%15s","A. seek many tasks, public activities, interaction with others \n","B. seek private, solitary activities with quiet to concentrate \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void extIntrovert4(){
        char userInput = 0;
        System.out.printf("%s%15s","A. external, communicative, express yourself ","B. internal, reticent, keep to yourself\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                extrovertA++;
                userChoice.add("A. external, communicative, express yourself");
                break;
            }else if (userInput == 'B'){
                introvertB++;
                userChoice.add("B. internal, reticent, keep to yourself");
                break;
            }System.out.printf("%s%15s","A. external, communicative, express yourself ","B. internal, reticent, keep to yourself\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void extIntrovert5(){
        char userInput = 0;
        System.out.printf("%s%15s","A. active, initiate ","B. reflective, deliberate\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                extrovertA++;
                userChoice.add("A. active, initiate");
                break;
            }else if (userInput == 'B'){
                introvertB++;
                userChoice.add("B. reflective, deliberate");
                break;
            }System.out.printf("%s%15s","A. active, initiate ","B. reflective, deliberate\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }





    public static void sensingNtuitive1(){
        char userInput = 0;
        System.out.printf("%s%15s","A. interpret literally ","B. look for meaning and possibilities\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                sensingA++;
                userChoice.add("A. interpret literally");
                break;
            }else if (userInput == 'B'){
                ntuitiveB++;
                userChoice.add("B.look for meaning and possibilities");
                break;
            }System.out.printf("%s%15s","A. interpret literally ","B. look for meaning and possibilities\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void sensingNtuitive2(){
        char userInput = 0;
        System.out.printf("%s%15s","A. practical, realistic, experiential ","B. imaginative, innovative, theoretical\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                sensingA++;
                userChoice.add("A. practical, realistic, experiential");
                break;
            }else if (userInput == 'B'){
                ntuitiveB++;
                userChoice.add("B.imaginative, innovative, theoretical");
                break;
            }System.out.printf("%s%15s","A. practical, realistic, experiential ","B. imaginative, innovative, theoretical\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void sensingNtuitive3(){
        char userInput = 0;
        System.out.printf("%s%15s","A. standard, usual, conventional ","B. different, novel, unique\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                sensingA++;
                userChoice.add("A. standard, usual, conventional");
                break;
            }else if (userInput == 'B'){
                ntuitiveB++;
                userChoice.add("B.different, novel, unique");
                break;
            }System.out.printf("%s%15s","A. standard, usual, conventional ","B. different, novel, unique\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void sensingNtuitive4(){
        char userInput = 0;
        System.out.printf("%s%15s","A. focus on here-and-now ","B. look to the future, global perspective, “big picture”\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                sensingA++;
                userChoice.add("A. focus on here-and-now");
                break;
            }else if (userInput == 'B'){
                ntuitiveB++;
                userChoice.add("B. look to the future, global perspective, “big picture”");
                break;
            }System.out.printf("%s%15s","A. focus on here-and-now ","B. look to the future, global perspective, “big picture”\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void sensingNtuitive5(){
        char userInput = 0;
        System.out.printf("%s%15s","A. facts, things, “what is”  ","B. ideas, dreams, “what could be,” philosophical\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                sensingA++;
                userChoice.add("A. facts, things, “what is” ");
                break;
            }else if (userInput == 'B'){
                ntuitiveB++;
                userChoice.add("B. ideas, dreams, “what could be,” philosophical");
                break;
            }System.out.printf("%s%15s","A. facts, things, “what is”  ","B. ideas, dreams, “what could be,” philosophical\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }





    public static void thinkFeeling1(){
        char userInput = 0;
        System.out.printf("%s%15s","A. logical, thinking, questioning ","B. empathetic, feeling, accommodating \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                thinkingA++;
                userChoice.add("A. logical, thinking, questioning");
                break;
            }else if (userInput == 'B'){
                feelingB++;
                userChoice.add("B. empathetic, feeling, accommodating ");
                break;
            }System.out.printf("%s%15s","A. logical, thinking, questioning ","B. empathetic, feeling, accommodating \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void thinkFeeling2(){
        char userInput = 0;
        System.out.printf("%s%15s","A. candid, straight forward, frank ","B. tactful, kind, encouraging \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                thinkingA++;
                userChoice.add("A. candid, straight forward, frank");
                break;
            }else if (userInput == 'B'){
                feelingB++;
                userChoice.add("B. tactful, kind, encouraging ");
                break;
            }System.out.printf("%s%15s","A. candid, straight forward, frank ","B. tactful, kind, encouraging \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void thinkFeeling3(){
        char userInput = 0;
        System.out.printf("%s%15s","A. firm, tend to criticize, hold the line. ","B. gentle, tend to appreciate, conciliate \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                thinkingA++;
                userChoice.add("A. firm, tend to criticize, hold the line.");
                break;
            }else if (userInput == 'B'){
                feelingB++;
                userChoice.add("B. gentle, tend to appreciate, conciliate");
                break;
            }System.out.printf("%s%15s","A. firm, tend to criticize, hold the line. ","B. gentle, tend to appreciate, conciliate \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void thinkFeeling4(){
        char userInput = 0;
        System.out.printf("%s%15s","A. tough-minded, just ","B. tender-hearted, merciful ”\n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                thinkingA++;
                userChoice.add("A. tough-minded, just");
                break;
            }else if (userInput == 'B'){
                feelingB++;
                userChoice.add("B. tender-hearted, merciful");
                break;
            }System.out.printf("%s%15s","A. tough-minded, just ","B. tender-hearted, merciful ”\n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void thinkFeeling5(){
        char userInput = 0;
        System.out.printf("%s%15s","A. matter of fact, issue-oriented ","B. sensitive, people-oriented, compassionate \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                thinkingA++;
                userChoice.add("A. matter of fact, issue-oriented");
                break;
            }else if (userInput == 'B'){
                feelingB++;
                userChoice.add("B. sensitive, people-oriented, compassionate ");
                break;
            }System.out.printf("%s%15s","A. matter of fact, issue-oriented ","B. sensitive, people-oriented, compassionate \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }




    public static void judgePercieve1(){
        char userInput = 0;
        System.out.printf("%s%15s","A. organized, orderly ","B. flexible, adaptable \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                judgingA++;
                userChoice.add("A. organized, orderly");
                break;
            }else if (userInput == 'B'){
                percieveB++;
                userChoice.add("B. flexible, adaptable ");
                break;
            }System.out.printf("%s%15s","A. organized, orderly ","B. flexible, adaptable \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void judgePercieve2(){
        char userInput = 0;
        System.out.printf("%s%15s","A. plan, schedule ","B. unplanned, spontaneous \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                judgingA++;
                userChoice.add("A. plan, schedule ");
                break;
            }else if (userInput == 'B'){
                percieveB++;
                userChoice.add("B. unplanned, spontaneous ");
                break;
            }System.out.printf("%s%15s","A. plan, schedule ","B. unplanned, spontaneous \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }


    public static void judgePercieve3(){
        char userInput = 0;
        System.out.printf("%s%15s","A. regulated, structured ","B. easygoing, “live” and “let live” \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                judgingA++;
                userChoice.add("A. regulated, structured ");
                break;
            }else if (userInput == 'B'){
                percieveB++;
                userChoice.add("B. easygoing, “live” and “let live” ");
                break;
            }System.out.printf("%s%15s","A. regulated, structured ","B. easygoing, “live” and “let live” \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void judgePercieve4(){
        char userInput = 0;
        System.out.printf("%s%15s","A. preparation, plan ahead ","B. go with the flow, adapt as you go \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                judgingA++;
                userChoice.add("A. preparation, plan ahead");
                break;
            }else if (userInput == 'B'){
                percieveB++;
                userChoice.add("B. go with the flow, adapt as you go  ");
                break;
            }System.out.printf("%s%15s","A. preparation, plan ahead ","B. go with the flow, adapt as you go \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');
    }

    public static void judgePercieve5(){
        char userInput = 0;
        System.out.printf("%s%15s","A. control, govern ","B. latitude, freedom \n");
        do {
            try {
                userInput = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Choose either A or B");
            }if (userInput == 'A') {
                judgingA++;
                userChoice.add("A. control, govern");
                break;
            }else if (userInput == 'B'){
                percieveB++;
                userChoice.add("B. latitude, freedom ");
                break;
            }System.out.printf("%s%15s","A. control, govern ","B. latitude, freedom \n");
        }while (scanner.next().charAt(0) != 'A' || scanner.next().charAt(0) != 'B');

    }


    public static int getExtrovertA() {
       // System.out.println(extrovertA);
        return extrovertA;
    }

    public static int getIntrovertB() {
        return introvertB;
    }

    public static int getSensingA() {
      //  System.out.println(sensingA);
        return sensingA;
    }

    public static int getNtuitiveB() {
        return ntuitiveB;
    }

    public static int getThinkingA() {
        return thinkingA;
    }

    public static int getFeelingB() {
        return feelingB;
    }

    public static int getJudgingA() {
        return judgingA;
    }

    public static int getPercieveB() {
        return percieveB;
    }

    public static ArrayList<String> getUserChoice() {
        return userChoice;
    }
}

