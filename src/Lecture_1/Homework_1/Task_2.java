package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int integerSum = 0;
        int integerDifference = 0;
        int integerProduct = 0;
        int integerReminderOfDivision = 0;
        int integerDivision = 0;

        double floatingPointNumberSum = 0;
        double floatingPointNumberDifference = 0;
        double floatingPointNumberProduct = 0;
        double floatingPointNumberReminderOfDivision = 0;
        double floatingPointNumberDivision = 0;

        System.out.println("Please enter first integer: ");
        int firstInteger = sc.nextInt();

        System.out.println("Please enter second integer: ");
        int secondInteger = sc.nextInt();

        if (firstInteger == secondInteger) {
            System.out.println("You have entered same integers.");
        } else {
            integerSum = firstInteger + secondInteger;
            integerDifference = firstInteger - secondInteger;
            integerProduct = firstInteger * secondInteger;

            System.out.println("Integers sum is " + integerSum);
            System.out.println("Integers difference is " + integerDifference);
            System.out.println("Integers product is " + integerProduct);

            if (secondInteger != 0) {
                integerReminderOfDivision = firstInteger % secondInteger;
                integerDivision = firstInteger / secondInteger;

                System.out.println("Integers remainder of division is " + integerReminderOfDivision);
                System.out.println("Integers division is " + integerDivision);
            } else {
                System.out.println("It is not allowed to divide by zero.");
            }
        }

        System.out.println();
        System.out.println("Please enter first floating point number: ");
        double firstFloatingPointNumber = sc.nextDouble();

        System.out.println("Please enter second floating point number: ");
        double secondFloatingPointNumber = sc.nextDouble();

        if (firstFloatingPointNumber == secondFloatingPointNumber) {
            System.out.println("You have entered same floating point numbers");
        } else {
            floatingPointNumberSum = firstFloatingPointNumber + secondFloatingPointNumber;
            floatingPointNumberDifference = firstFloatingPointNumber - secondFloatingPointNumber;
            floatingPointNumberProduct = firstFloatingPointNumber * secondFloatingPointNumber;

            System.out.println("Floating point numbers sum is " + floatingPointNumberSum);
            System.out.println("Floating point numbers difference is " + floatingPointNumberDifference);
            System.out.println("Floating point numbers product is " + floatingPointNumberProduct);
            if (secondFloatingPointNumber != 0) {
                floatingPointNumberReminderOfDivision = firstFloatingPointNumber % secondFloatingPointNumber;
                floatingPointNumberDivision = firstFloatingPointNumber / secondFloatingPointNumber;

                System.out.println("Floating point numbers remainder of division is " + floatingPointNumberReminderOfDivision);
                System.out.println("Floating point numbers division is " + floatingPointNumberDivision);
            }
            else {
                System.out.println("It is not allowed to divide by zero.");
            }
        }
    }
}
