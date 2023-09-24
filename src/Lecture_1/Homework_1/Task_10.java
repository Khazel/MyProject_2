package Lecture_1.Homework_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a natural number from the keyboard in the range [0-24]");
        int number = sc.nextInt();

        if ((number >= 5) && (number <= 10)) {
            System.out.println("5-10 – Good morning");
        }
        if ((number >= 11) && (number <= 18)) {
            System.out.println("11-18 – Good day");
        }
        if ((number >= 19) && (number <= 23)) {
            System.out.println("19-23 – Good evening");
        }
        if (((number >= 0) && (number < 5)) || (number == 24)) {
            System.out.println("24-5 – Why aren't you sleeping?");
        }
    }
}
