package Lecture_3.Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter two integers");
        int firstInteger = sn.nextInt();
        int secondInteger = sn.nextInt();

        int [] array = new int [10];
        array[0] = firstInteger;
        array[1] = secondInteger;

        for (int i = 2; i < 10; i++) {
            int sum = array[i - 2] + array[i - 1];
            if (i % 2 == 0) {
                array[i] = sum * 3;
            } else {
                array[i] = sum / 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
