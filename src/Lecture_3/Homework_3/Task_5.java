package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_5 {

    public static void main(String[] args) {

        int [] array = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 4;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
