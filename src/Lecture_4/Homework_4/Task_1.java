package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter your text");
        String input = sn.nextLine();

        ConvertInput(input);
    }

    public static void ConvertInput (String input) {
        System.out.println(input.toUpperCase() + ", " + input.toLowerCase());
    }
}
