package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1 four-digit natural number from the keyboard that falls within the range [1000 – 9999].");
        int number = sc.nextInt();
        System.out.println("Input:");
        System.out.println(number);

        if ((number >= 1000) && (number <= 9999)) {
            int firstDigit = number/1000%10;
            int secondDigit = number/100%10;
            int thirdDigit = number/10%10;
            int fourthDigit = number%10;

            int firstNumber = firstDigit * 10 + fourthDigit;
            int secondNumber = secondDigit * 10 + thirdDigit;

            System.out.println("Output:");
            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " > " + secondNumber);
            } else if ( firstNumber == secondNumber) {
                System.out.println(firstNumber + " = " + secondNumber);
            } else {
                System.out.println(firstNumber + "<" + secondNumber);
            }
        } else {
            System.out.println("Your number is out of range.");
        }
    }
}
