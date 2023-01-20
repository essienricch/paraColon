package chapter14;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTypes {

    public static void main(String[] args) {

        byte item1 = Byte.parseByte("65");
        byte item2 = Byte.parseByte("100");
        byte item3 = Byte.parseByte("101");
        byte[] myByteArray = {item1, item2, item3};
        String myName = new String(myByteArray, 0,3);
        System.out.println(myName);

        // LENGTH:
        System.out.println(myName.length() == 3);

        //NAME @CHAR-LENGTH:
        String secName = new String("DUNAMIS");
        System.out.println(secName);
        System.out.println(secName.charAt(3));

        //CHAR:
        char[] charArray = {'A','B','C','D'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);

        //CHAR 2:
        char[] chars = new char[20];
        String string =  new String("Semicolon Africa");
        string.getChars(2,9,chars,13);

        System.out.println(Arrays.toString(chars));

        //REGION-MATCH:

        String name = "Hello";
        String str =  new String("Hello");
        System.out.println(name.indexOf('e',2));
        System.out.println(name.lastIndexOf('l',0));
        System.out.println();
        System.out.println(name.regionMatches(true,0,str,0,5));

        // CHARACTER WITH DIGIT:
        String text = """
                1. We are paragons
                2. I am a winner 365 days a year
                3. God is the greatest
                4. There are 7 days a week
                 """;

        StringBuilder digitWithInText = new StringBuilder();
        for (int count = 0; count < text.length(); count++) {
            char currentCharacter = text.charAt(count);
            if (Character.isDigit(currentCharacter)){
                digitWithInText.append(currentCharacter);
            }
        }
        System.out.println("String builder ref --> ");
        System.out.println(digitWithInText.toString());

        //SUBSTRING:
        String  school = "Semicolon Africa";
        String continent = school.substring(10);
        String extract = continent.substring(2, 6);
        System.out.println(extract);
        System.out.println(school.toLowerCase(Locale.FRENCH));
        System.out.println(school.replace('o','u'));
        System.out.println(continent);

        char[] myCharArray = school.toCharArray();
        System.out.println(myCharArray);
        System.out.println(String.valueOf(23.00));
        System.out.println(String.valueOf(true));

        String namey = "Satcha";
        StringBuilder stringBuilder = new StringBuilder(namey);
        System.out.println(stringBuilder.append("-mira"));
        stringBuilder.deleteCharAt(6);
        //System.out.println(stringBuilder);
       // System.out.println(stringBuilder.capacity());

        stringBuilder.append(1);
        stringBuilder.append(2);
        stringBuilder.append(3);
        stringBuilder.insert(6,'-');
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(6,'-');
       // stringBuilder.ensureCapacity(30);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        String newVersion = "solo-mint";
        stringBuilder.append(newVersion,6,7);
        System.out.println(stringBuilder);

        //TODO: CHARACTER -->

        //TODO: REGEX:
        Pattern pattern = Pattern.compile("e.+d");
        Matcher matcher = pattern.matcher("Life is Good");
        while (matcher.matches()){
            System.out.println("Matches--> " + matcher.group());
        }




    }

}
