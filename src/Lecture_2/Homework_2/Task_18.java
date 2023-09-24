package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_18 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        // I am not sure if it is showing correct output when last digit is 0
        System.out.println("Please enter a number in interval 1-10000");
        int input = sn.nextInt();
        int reversedInput = 0;
        int remainder;

        if ((input >= 10) && (input <= 10000)) {
            while (input != 0) {
                remainder = input % 10;
                reversedInput = reversedInput * 10 + remainder;
                input /= 10;
            }
            System.out.println(reversedInput);
        } else {
            System.out.println("Your value is out of range.");
        }
    }
}
