package Lecture_3.Homework_3;

public class Task_4 {

    public static void main(String[] args) {

        int [] array = {23, 4, 4, 23};
        boolean isMirrored = true;

        int length = array.length;
        int start = 0;
        int end = length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            if (array[start] != array[end]) {
                isMirrored = false;
            }

            start++;
            end--;
        }

        if (isMirrored) {
            System.out.println("Array is mirrored.");
        } else {
            System.out.println("Array is not mirrored.");
        }
    }
}
