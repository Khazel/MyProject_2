package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter first integer");
        int firstInteger = sn.nextInt();

        System.out.println("Please enter second integer");
        int secondInteger = sn.nextInt();

        int result = getTotal(firstInteger, secondInteger);

        System.out.println();
        System.out.println(result);
    }

    public static int getTotal(int first, int second) {

        int sum = first + second;
        return sum;
    }
}
