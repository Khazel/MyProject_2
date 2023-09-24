package Lecture_2.Lecture_2;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        do {
            System.out.println("Enter a number");
            int number = sc.nextInt();

            sum = sum + number; // sum += number;
            counter++;
        } while (counter < 3);

        System.out.println(sum);
    }
}
