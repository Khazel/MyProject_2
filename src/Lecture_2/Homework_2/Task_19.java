package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_19 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a number in interval 1-30");
        int input = sn.nextInt();
        int iterator = 0;
        int previousNumber = 0;
        int nextNumber = 1;
        int output;

        System.out.print("0, "); // No intent to cheat, but I don't know how to start the output from 0 if not like this

        while (iterator < input - 1) {
            output = previousNumber + nextNumber;
            nextNumber = previousNumber;
            previousNumber = output;
            if (iterator == input - 2) {
                System.out.println(output);
            } else {
                System.out.print(output + ", ");
            }
            iterator++;
        }
    }
}
