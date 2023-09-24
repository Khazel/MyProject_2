package Lecture_3.Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter dimension of your square array");
        int arrayDimension = sn.nextInt();

        if (arrayDimension < 2) {
            System.out.println("Your array dimension should be more than one");
        } else {
            int [][] array = new int [arrayDimension][arrayDimension];

            System.out.println("Please enter elements of array");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = sn.nextInt();
                    System.out.println(Arrays.deepToString(array));
                }
            }

            System.out.println();

            int counterForward = 0;
            int counterBackward = 0;
            int mainDiagonalSum = 0;
            int secondDiagonalSum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    mainDiagonalSum += array[i][j + counterForward];
                    break;
                }
                counterForward++;
            }
            System.out.println("The main diagonal sum is: " + mainDiagonalSum);

            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j >= 0; j--) {
                    secondDiagonalSum += array[i][j - counterBackward];
                    break;
                }
                counterBackward++;
            }

            System.out.println("The second diagonal sum is: " + secondDiagonalSum);
        }
    }
}
