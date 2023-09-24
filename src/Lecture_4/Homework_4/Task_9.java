package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a signle positive integer");
        String input = sn.nextLine();

        int formattedNumber = Integer.parseInt(input);

        if (formattedNumber < 0) {
            System.out.println("You have entered a negative integer.");
        } else {
            int result = factorial(formattedNumber);
            System.out.println("The factorial of " + input + " is " + result);
        }
    }

    public static int factorial(int number) {

        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
