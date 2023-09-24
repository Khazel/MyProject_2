package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Please enter a positive number");

        Scanner sn = new Scanner(System.in);
        int input = sn.nextInt();

        if (input >= 0) {
            for (int i = 1; i <= input; i++) {
                for (int j = i; j < input; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("You have entered a negative number.");
        }
    }
}
