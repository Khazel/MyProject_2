package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a positive integer");
        int input = sn.nextInt();
        int output;

        if (input > 0) {
            for (int index = 1; index <= input; index++)
            {
                output = 3 * index;
                if (index == input) {
                    System.out.print(output);
                } else {
                    System.out.print(output + ", ");
                }
            }
        } else {
            System.out.println("You have entered an incorrect value.");
        }
    }
}
