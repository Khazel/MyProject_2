package Lecture_3.Lecture_3;

public class InterviewQuestion {
    public static void main(String[] args) {
        // ******************
        int a = 1;
        // What is wrong. Find the bug!
        while (a < 10 ) {
            int b = 1;
            while (b < 10) {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }

        // ******************
        System.out.println("Start..");

        // this is a comment \u000d System.out.println("Hello!");

        System.out.println("End!");
    }
}
