package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_16_No_Loop {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a number in interval 10-30000");
        int input = sn.nextInt();

        if ((input >= 10) && (input < 100)) {
            int firstDigit = input/10%10;
            int secondDigit = input%10;

            if (firstDigit == secondDigit) {
                System.out.println("The number " + input + " is a palindrome.");
            } else {
                System.out.println("The number " + input + " is not a palindrome.");
            }
        }
        if ((input >= 100) && (input < 1000)) {
            int firstDigit = input/100%10;
            int thirdDigit = input%10;

            if (firstDigit == thirdDigit) {
                System.out.println("The number " + input + " is a palindrome.");
            } else {
                System.out.println("The number " + input + " is not a palindrome.");
            }
        }
        if ((input >= 1000) && (input < 10000))
        {
            int firstDigit = input/1000%10;
            int secondDigit = input/100%10;
            int thirdDigit = input/10%10;
            int forthDigit = input%10;

            if ((firstDigit == forthDigit) && (secondDigit == thirdDigit)) {
                System.out.println("The number " + input + " is a palindrome.");
            } else {
                System.out.println("The number " + input + " is not a palindrome.");
            }
        }
        if ((input >= 10000) && (input <= 30000)) {
            int firstDigit = input/10000%10;
            int secondDigit = input/1000%10;
            int forthDigit = input/10%10;
            int fifthDigit = input%10;

            if ((firstDigit == fifthDigit) && (secondDigit == forthDigit)) {
                System.out.println("The number " + input + " is a palindrome.");
            } else {
                System.out.println("The number " + input + " is not a palindrome.");
            }
        }
        if ((input < 10) || (input > 30000)) {
            System.out.println("Your value is out of range.");
        }
    }
}
