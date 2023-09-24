package Lecture_3.Lecture_3;

public class AccessingArrays {
    public static void main(String[] args) {
        int[] array = {5, 7, -2, 12, 0};

        // Using a for loop
        System.out.println("Using a for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println("Element " + index + " = " + array[index]);
        }

        // Backwards
        for (int index = array.length-1; index >= 0 ; index--) {
            System.out.println("Backwards Element " + index + " = " + array[index]);
        }

        // Using while loop
        System.out.println("Using while loop...");
        int i = 0;
        while (i < array.length) {
            System.out.println("While loop Element " + i + " = " + array[i]);
            i++;
        }

        // Do while
        System.out.println("Using do-while loop...");
        int j = 0;
        do {
            System.out.println("Do-While loop Element " + j + " = " + array[j]);
            j++;
        } while (j < array.length);

        // Using foreach loop
        System.out.println("Using foreach loop...");
        for (int number : array) {
            System.out.println(number);
        }
    }
}
