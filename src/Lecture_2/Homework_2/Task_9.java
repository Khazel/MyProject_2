package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;

        System.out.println("Please enter natural numbers. When you are done, please enter '0'.");
        int input = sn.nextInt();
        if (input > 0) {
            smallest = input;
            largest = input;

            do {
                input = sn.nextInt();
                if (input > 0) {
                    if (smallest > input) {
                        smallest = input;
                    }
                    if (largest < input) {
                        largest = input;
                    }
                } else if (input < 0) {
                    System.out.println("You have entered an incorrect value");
                    break;
                }
            } while (input != 0);

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        } else if (input < 0) {
            System.out.println("You have entered an incorrect value");
        } else {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }
    }
}
