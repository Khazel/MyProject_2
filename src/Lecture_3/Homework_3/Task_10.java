package Lecture_3.Homework_3;

public class Task_10 {

    public static void main(String[] args) {

        int [] array = {1, 6, 3, 7, 2, 9, -2, 12, 5};
        boolean isZigZag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (!(array[i] < array[i + 1])) {
                    isZigZag = false;
                    break;
                }
            } else {
                if (!(array[i] > array[i + 1])) {
                    isZigZag = false;
                    break;
                }
            }
        }

        if (isZigZag == true) {
            System.out.println("Zigzag");
            return;
        }

        isZigZag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (!(array[i] > array[i + 1])) {
                    isZigZag = false;
                    break;
                }
            } else {
                if (!(array[i] < array[i + 1])) {
                    isZigZag = true;
                    break;
                }
            }
        }

        if (isZigZag == true) {
            System.out.println("Zigzag");
        } else {
            System.out.println("Not a Zigzag");
        }
    }
}
