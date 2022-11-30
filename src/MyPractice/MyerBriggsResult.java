package MyPractice;

import java.util.*;
import java.util.Arrays;

public class MyerBriggsResult {

    static Scanner scanner = new Scanner(System.in);
   static String userName;

   static ArrayList <String> personality = new ArrayList<>();
   static String personalityType;

    public static void setUserName(String name){
        MyerBriggsResult.userName = name.toUpperCase();
    }

    public static String getUserName() {
        return userName;
    }

    public static void switchExtIntrovert(){
        for (int index = 1; index <= 5; index++) {
            switch (index) {
                case 1 -> MyerBriggs.extIntrovert1();
                case 2 -> MyerBriggs.extIntrovert2();
                case 3 -> MyerBriggs.extIntrovert3();
                case 4 -> MyerBriggs.extIntrovert4();
                case 5 -> MyerBriggs.extIntrovert5();
            }
        }
    }

    public static void switchSenseIntuitive(){
        for (int index = 1; index <= 5; index++) {
            switch (index) {
                case 1 -> MyerBriggs.sensingNtuitive1();
                case 2 -> MyerBriggs.sensingNtuitive2();
                case 3 -> MyerBriggs.sensingNtuitive3();
                case 4 -> MyerBriggs.sensingNtuitive4();
                case 5 -> MyerBriggs.sensingNtuitive5();
            }
        }
    }

    public static void switchThinkFeels(){
        for (int index = 1; index <= 5; index++) {
            switch (index) {
                case 1 -> MyerBriggs.thinkFeeling1();
                case 2 -> MyerBriggs.thinkFeeling2();
                case 3 -> MyerBriggs.thinkFeeling3();
                case 4 -> MyerBriggs.thinkFeeling4();
                case 5 -> MyerBriggs.thinkFeeling5();
            }
        }
    }

    public static void switchJudgePercieve(){
        for (int index = 1; index <= 5; index++) {
            switch (index) {
                case 1 -> MyerBriggs.judgePercieve1();
                case 2 -> MyerBriggs.judgePercieve2();
                case 3 -> MyerBriggs.judgePercieve3();
                case 4 -> MyerBriggs.judgePercieve4();
                case 5 -> MyerBriggs.judgePercieve5();
            }
        }
    }

    public static void result(){
        System.out.println();
        System.out.println("Hello " + userName + " you selected: ");
        for (int i = 0; i < MyerBriggs.getUserChoice().size(); i++) {
            System.out.println(MyerBriggs.getUserChoice().get(i));
        }
    }

    public static void personExtInt(){
        if (MyerBriggs.getExtrovertA() > MyerBriggs.getIntrovertB()){
         MyerBriggsResult.personality.add("E");
        }else {
         MyerBriggsResult.personality.add("I");
        }
    }

    public static void personSenseNtuitive(){
        if (MyerBriggs.getSensingA() > MyerBriggs.getNtuitiveB()){
            MyerBriggsResult.personality.add("S");
        }else {
            MyerBriggsResult.personality.add("N");
        }
    }

    public static void personThinkFeel(){
        if (MyerBriggs.getThinkingA() > MyerBriggs.getFeelingB()){
            MyerBriggsResult.personality.add("T");
        }else {
            MyerBriggsResult.personality.add("F");
        }
    }

    public static void personJudgePercieve(){
        if (MyerBriggs.getJudgingA() > MyerBriggs.getPercieveB()){
            MyerBriggsResult.personality.add("J");
        }else {
            MyerBriggsResult.personality.add("P");
        }
    }


    public static void personality(){
        StringBuilder type = new StringBuilder();
        for (String word : personality){
            type.append(word);
        }
        switch (type.toString()) {
            case "ISTJ" -> personalityType = "RELIANT";
            case "ISFJ" -> personalityType = "NURTURE";
            case "INFJ" -> personalityType = "MYSTIC";
            case "INTJ" -> personalityType = "FREE-THINKER";
            case "ISTP" -> personalityType = "REALIST";
            case "ISFP" -> personalityType = "ADVENTURER";
            case "INFP" -> personalityType = "DREAMER";
            case "INTP" -> personalityType = "LOGICIAN";
            case "ESTP" -> personalityType = "ENTREPRENEUR";
            case "ESFP" -> personalityType = "ENTERTAINER";
            case "ENFP" -> personalityType = "VISIONARY";
            case "ENTP" -> personalityType = "INNOVATOR";
            case "ESTJ" -> personalityType = "ENFORCER";
            case "ESFJ" -> personalityType = "HELPER";
            case "ENFJ" -> personalityType = "SAGE";
            case "ENTJ" -> personalityType = "LEADER";
        }
        System.out.println(type +  " --> " + personalityType);

    }

}




