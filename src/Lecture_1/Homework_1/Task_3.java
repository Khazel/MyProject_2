package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number ");
        int firstNumber = sc.nextInt();

        System.out.println("Please enter second number ");
        int secondNumber = sc.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Ascending order:");
            System.out.println(firstNumber + ", " + secondNumber);
            System.out.println("Descending order:");
            System.out.println(secondNumber + ", " + firstNumber);
        } else {
            System.out.println("Ascending order:");
            System.out.println(secondNumber + ", " + firstNumber);
            System.out.println("Descending order:");
            System.out.println(firstNumber + ", " + secondNumber);
        }
    }
}
