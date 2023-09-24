package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter natural number in interval from 10 to 300");
        int input = sn.nextInt();

        if ((input >= 10) && (input <= 300)) {
            for (int i = input; i >= 1; i--) {
                if ((i % 7 == 0) && (i < input)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Your number is out of range.");
        }
    }
}
