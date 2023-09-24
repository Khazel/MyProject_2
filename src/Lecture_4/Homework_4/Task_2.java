package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter first line of text");
        String firstString = sn.nextLine();

        System.out.println("Please enter second line of text");
        String secondString = sn.nextLine();

        System.out.println("The longest string is: " + ((firstString.length() > secondString.length()) ? firstString : secondString));

        System.out.println(firstString + " - " + firstString.length() + ", " + secondString + " - " + secondString.length());
    }
}
