package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Please enter a positive number");

        boolean isItPrime = true;

        Scanner sn = new Scanner(System.in);
        int input = sn.nextInt();

        if (input >= 0) {
            if (input <= 1) {
                isItPrime = false;
            } else {
                for (int i = 2; i <= input/2; i++) {
                    if((input % i) == 0) {
                        isItPrime = false;
                        break;
                    }
                }
            }
            if (isItPrime) {
                System.out.println(input + " is a prime number.");
            } else {
                System.out.println(input + " is not a prime number.");
            }
        } else {
            System.out.println("You have entered a negative number.");
        }
    }
}
