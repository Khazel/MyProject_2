package Lecture_4.Lecture_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {

        String s2 = "My name is Kaloyan. My ID number is 9901010001 and it can be used for recognition.";
        String replaceString = s2.replaceAll("[^0-9]", "");
        System.out.println(replaceString);

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); // false
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); // false, because fo $

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9901010001")); // true
        System.out.println(Pattern.matches("[789][0-9]{9}", "6901010001")); // false

        System.out.println(Pattern.matches("[789]+", "97896789987")); // false because of the 6

        System.out.println("-------------------------------");
        String line = "This order was placed for AT3456! OK?";
        Pattern pattern = Pattern.compile("(.*?)(\\d+)(.*)");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println("group 1: " + matcher.group(1));
            // This order was placed for AT
            System.out.println("group 2: " + matcher.group(2));
            // 3456
            System.out.println("group 3: " + matcher.group(3));
            // ! OK?
        }
    }
}
