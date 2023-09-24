package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a number in interval 10-30000");
        int input = sn.nextInt();
        int inputDisplay = input;
        int reversedInput = 0;
        int remainder;

        if ((input >= 10) && (input <= 30000)) {
            while (input != 0) {
                remainder = input % 10;
                reversedInput = reversedInput * 10 + remainder;
                input /= 10;
            }

            if (inputDisplay == reversedInput) {
                System.out.println("The number " + inputDisplay + " is a palindrome.");
            }
            else {
                System.out.println("The number " + inputDisplay + " is not a palindrome.");
            }
        } else {
            System.out.println("Your value is out of range.");
        }
    }
}
