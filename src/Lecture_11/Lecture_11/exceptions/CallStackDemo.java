package Lecture_11.Lecture_11.exceptions;

public class CallStackDemo {
    public static void main(String[] args) {
        System.out.println("Started Main");
        methodA();
        System.out.println("Finished Main");
    }

    private static void methodA() {
        System.out.println("Started Method A");
        methodB();
        System.out.println("Finished Method A");
    }

    private static void methodB() {
        System.out.println("Started Method B");
        methodC();
        System.out.println("Finished Method B");
    }

    private static void methodC() {
        System.out.println("Started Method C");
        System.out.println("Finished Method C");
    }
}
