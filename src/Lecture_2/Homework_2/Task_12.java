package Lecture_2.Homework_2;

public class Task_12 {

    public static void main(String[] args) {

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (b != a) {
                    for (int c = 0; c < 10; c++) {
                        if ((c != a) && (c != b)) {
                            System.out.println(a + "" + b + "" + c);
                        }
                    }
                }
            }
        }
    }
}
