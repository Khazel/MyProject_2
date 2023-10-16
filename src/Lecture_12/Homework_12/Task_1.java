package Lecture_12.Homework_12;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter the text");
        String userInput = sn.nextLine();

        Map<Character, StringBuilder> concordance = new HashMap<>();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                if (concordance.containsKey(c)) {
                    concordance.get(c).append(", " + i);
                } else {
                    StringBuilder value = new StringBuilder();
                    value.append(i);
                    concordance.put(c, value);
                }
            }
        }
        System.out.println(concordance);
    }
}
