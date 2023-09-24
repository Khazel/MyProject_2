package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_7 {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10};

        int currentCount = 1;
        int maxCount = 1;
        int longestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                longestElement = array[i];
            }
        }

        int[] longestSequence = new int[maxCount];
        for (int i = 0; i < maxCount; i++) {
            longestSequence[i] = longestElement;
        }

        System.out.println(Arrays.toString(longestSequence));
    }
}
