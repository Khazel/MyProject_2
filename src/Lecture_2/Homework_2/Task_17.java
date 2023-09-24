package Lecture_2.Homework_2;

import java.util.Scanner;

public class Task_17 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        // This thing breaks at value "66" as it reaches long limits.
        System.out.println("Please enter a positive number");
        int input = sn.nextInt();
        long factorial = 1;

        if (input >= 0) {

            for (int i = input; i > 0; i--) {
                factorial*=i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("You have entered a negative number.");
        }
    }
}
