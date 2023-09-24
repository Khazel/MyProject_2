package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number ");
        int firstNumber = sc.nextInt();

        System.out.println("Please enter second number ");
        int secondNumber = sc.nextInt();

        System.out.println("Please enter third number ");
        int thirdNumber = sc.nextInt();

        System.out.println("Values before snapping:");
        System.out.println("first number - " + firstNumber);
        System.out.println("second number - " + secondNumber);
        System.out.println("third number - " + thirdNumber);

        int someValue = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = someValue;

        System.out.println("Values after snapping:");
        System.out.println("first number - " + firstNumber);
        System.out.println("second number - " + secondNumber);
        System.out.println("third number - " + thirdNumber);
    }
}
