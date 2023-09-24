package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int input = sn.nextInt();

        boolean isOdd = isOdd(input);

        System.out.println("Your integer is " + ((isOdd) ? "odd" : "even"));
    }

    public static boolean isOdd(int number) {

        boolean result = false;

        if (number % 2 != 0) {
            result = true;
        }
    return result;
    }
}
