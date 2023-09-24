package Lecture_3.Homework_3;

public class Task_1 {

    public static void main(String[] args) {

        int [] array = {1, 4, 5, 2 , 7, 10, 14, 55, 17, 25, 15, 12};
        int largest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                if (array[i] > largest) {
                    largest = array[i];
                }
            }
        }

        System.out.println(largest);
    }
}
