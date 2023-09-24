package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter your text");
        String input = sn.nextLine();

        String [] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                String formattedWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                result.append(formattedWord).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
