package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter two numbers");
        int firstNumber = sn.nextInt();
        int secondNumber = sn.nextInt();

        if (firstNumber < secondNumber) {
            for (int index = firstNumber; index <= secondNumber; index++) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("First number should be less than second number.");
        }
    }
}
