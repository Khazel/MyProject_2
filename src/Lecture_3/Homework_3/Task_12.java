package Lecture_3.Homework_3;

public class Task_12 {

    public static void main(String[] args) {

        int [] [] array = {
                {48, 72, 13, 14, 15, 43, 19},
                {21, 22, 53, 24, 75, 48, 17},
                {31, 57, 33, 34, 35, 63, 12},
                {41, 95, 43, 44, 45, 91, 50},
                {59, 52, 53, 54, 55, 14, 32},
                {61, 69, 63, 64, 65, 81, 15},
                {42, 32, 12, 26, 59, 67, 97}
        };
        int smallest = array[0][0];
        int largest = array[array.length - 1][array.length - 1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
