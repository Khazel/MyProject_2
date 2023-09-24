package Lecture_3.Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_14 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter the number of rows for your two dimensional array");
        int rows = sn.nextInt();

        System.out.println("Please enter the number of columns for your two dimensional array");
        int columns = sn.nextInt();

        if ((rows < 2) || (columns < 1)) {
            System.out.println("The number of rows for two dimensional array should be more than two, and number of columns should be more than one");
        } else {
            int [][] array = new int [rows][columns];
            int [][] newArray = new int [rows][columns];
            int counter = 1;

            System.out.println("Please enter elements of array");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = sn.nextInt();
                    System.out.println(Arrays.deepToString(array));
                }
            }

            System.out.println();
            System.out.println("Input:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    newArray[j][i] = array[i][array[i].length - counter];
                    counter++;
                }
                counter = 1;

            }

            System.out.println();
            System.out.println("Output:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(Arrays.toString(newArray[i]));
            }
        }
    }
}
