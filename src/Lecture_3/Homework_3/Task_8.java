package Lecture_3.Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter array size");
        int [] array = new int [sn.nextInt()];

        System.out.println("Please enter numbers to populate an array");

        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = sn.nextInt();
        }

        // One additional array
        int [] reversedArray = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        System.out.println("With one additional array - " + Arrays.toString(reversedArray));

        // No additional arrays
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println("With no additional arrays - " + Arrays.toString(array));
    }
}
