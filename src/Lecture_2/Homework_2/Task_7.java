package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a positive integer");
        int input = sn.nextInt();
        int sum = 0;

        if (input >= 0) {
            for (int index = 1; index <= input; index++) {
                sum += index;
            }
            System.out.println("The sum of all numbers to " + input + " is " + sum);
        } else {
            System.out.println("You have entered a negative integer.");
        }
    }
}
