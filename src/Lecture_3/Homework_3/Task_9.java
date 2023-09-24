package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_9 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Exchange elements at indexes 0 and 1 using a third variable
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        // Exchange elements at indexes 8 and 9 using a third variable
        temp = array[8];
        array[8] = array[9];
        array[9] = temp;

        // Exchange elements at indexes 2 and 3 by addition/subtraction
        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        // Exchange elements at indexes 4 and 5 by multiplication
        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];

        // Exchange elements at indexes 6 and 7 using bitwise XOR - I did not understand how it works. When I look at
        // debugger it first summed two values, then deducted them. But how it understands a condition?
        array[6] = array[6] ^ array[7];
        array[7] = array[6] ^ array[7];
        array[6] = array[6] ^ array[7];

        System.out.println(Arrays.toString(array));
    }
}
