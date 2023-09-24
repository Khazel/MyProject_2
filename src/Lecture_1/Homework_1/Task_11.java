package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a three-digit natural number");
        int number = sc.nextInt();

        int firstDigit = number/100%10;
        int secondDigit = number/10%10;
        int thirdDigit = number%10;

        if ((firstDigit == secondDigit) && (secondDigit == thirdDigit)) {
            System.out.println("The numbers are equal.");
        } else {
            if ((firstDigit < secondDigit) && (secondDigit < thirdDigit)) {
                System.out.println("Ascending order.");
            } else {
                if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)) {
                    System.out.println("Descending order.");
            } else {
                    System.out.println("Try with another number.");
                }
            }
        }
    }
}
