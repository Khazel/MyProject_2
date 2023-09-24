package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_6 {

    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5, 6};
        int [] array2 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(array1, array2)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not identical");
        }
    }
}
