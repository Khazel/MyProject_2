package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter A: ");
        double a = sc.nextDouble();

        System.out.println("Please enter B: ");
        double b = sc.nextDouble();

        System.out.println("Please enter C: ");
        double c = sc.nextDouble();

        if ((c > a) && (c < b)) {
            System.out.println("Number " + c + " is between " + a + " and " + b);
        } else if ((c < a) && (c > b)) {
            System.out.println("Number " + c + " is between " + a + " and " + b);
        } else {
            System.out.println("Number " + c + " is not between " + a + " and " + b);
        }
    }
}
