package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_11 {

    public static void main(String[] args) {

        int [] array1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int [] array2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int [] array3 = new int [array1.length];

        int array1Sum = 0;
        int array2Sum = 0;
        int array3Sum = 0;
        int product = 1;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array2[i]) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i];
            }
            array1Sum += array1[i];
            array2Sum += array2[i];
            array3Sum += array3[i];
            product *= array3[i];
        }

        int sum = array1Sum + array2Sum +array3Sum;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("The sum of the three arrays: " + array1Sum + " + " + array2Sum + " + " + array3Sum + " = " + sum);
        System.out.println("The product of the elments of the third array: " + product);
    }
}
