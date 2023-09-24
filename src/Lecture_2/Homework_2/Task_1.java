package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter 'Y/y' or 'N/n'");
        String input = sn.nextLine();

        switch (input) {
            case "Y":
            case "y":
                System.out.println("Yes");
                break;
            case "N":
            case "n":
                System.out.println("No");
                break;
            default:
                System.out.println("Please enter correct value");

        }
    }
}
