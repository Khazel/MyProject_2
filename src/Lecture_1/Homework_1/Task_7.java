package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two natural two-digit numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println("Input:");
        System.out.println(firstNumber + ", " + secondNumber);

        int multiplicationResult = firstNumber * secondNumber;

        System.out.println("Output:");
        if (multiplicationResult % 2 == 0) {
            System.out.println(multiplicationResult + " - even");
        } else {
            System.out.println(multiplicationResult + " - odd");
        }

        int lastDigit = multiplicationResult % 10;
        if (lastDigit%3 == 0) {
            System.out.println(lastDigit + " is divisible by 3");
        } else {
            System.out.println(lastDigit + " is not divisible by 3");
        }
    }
}
