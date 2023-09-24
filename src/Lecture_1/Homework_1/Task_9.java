package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer in the range [0-100]");
        int integer = sc.nextInt();

        if ((integer >= 0) && (integer <= 100)) {
            if (integer == 0) {
                System.out.println("0 – it will not rain");
            } else if (integer <= 5) {
                System.out.println("Between 0 and 5 - minimal chance of precipitation");
            } else if (integer <= 20) {
                System.out.println("Between 5 and 20 - a small chance of precipitation");
            } else if (integer <= 50) {
                System.out.println("Between 20 and 50 - there is a chance of precipitation");
            } else if (integer <= 80) {
                System.out.println("Between 50 and 80 - high chance of precipitation");
            } else if (integer <= 100) {
                System.out.println("Between 80 and 100 - it will rain");
            }
        } else {
            System.out.println("Your value is out of range.");
        }
    }
}
