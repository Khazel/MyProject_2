package Lecture_11.Lecture_11.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
//        String exceptionString = null;
//
//        // logic to initialize name
//        if (exceptionString.equals("gfg")) {
//            System.out.println(exceptionString);
//        } else {
//            System.out.println("Not Same!");
//        }
//        int a = 10;
//        int b = 0;
//
//        System.out.println(a/b);

        int[] array = {1, 2, 3, 4, 5};

        methodA(array);

        System.out.println(array[5]);

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number);
    }

    static void methodA(int[] array) {
        System.out.println("methodA");
        methodB(array);
    }

    static void methodB(int[] array) {
        System.out.println("methodB");
        methodC(array);
    }

    static void methodC(int[] array) {
        System.out.println("methodC");
//        System.out.println(array[5]); // indexOutOfBoundsException -> Unchecked

        methodD(array);
    }

    static void methodD(int[] array) {
        System.out.println("methodD");
        throw new RuntimeException("Send the unchecked exception on the next method");
//        new RuntimeException("Send the unchecked exception on the next method");
//        new RuntimeException("Send the unchecked exception on the next method");
    }
}
