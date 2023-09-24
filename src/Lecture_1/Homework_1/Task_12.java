package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the year");
        int year = sc.nextInt();

        if (year % 4 != 0) {
            System.out.println("It is not a leap year");
        } else {
            if (year % 100 != 0) {
                System.out.println("It is a leap year");
            } else {
                if (year % 400 == 0) {
                    System.out.println("It is a leap yer");
                } else {
                    System.out.println("It is not a leap year");
                }
            }
        }
    }
}
