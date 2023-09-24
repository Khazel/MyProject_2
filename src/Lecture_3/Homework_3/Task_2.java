package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_2 {

    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = originalArray.length;

        int[] newArray = new int[length];

        for (int i = 0; i < length / 2; i++) {
            newArray[i] = originalArray[i + length / 2];
        }

        for (int i = length / 2; i < length; i++) {
            newArray[i] = originalArray[length - 1 - (i - length / 2)];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
