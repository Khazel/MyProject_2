package Lecture_13.Lecture_13.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReadDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        System.out.print("Input number x: ");
        try {
            x = Integer.parseInt(br.readLine());
            System.out.println("x + 1 = " + (x + 1));
        } catch (NumberFormatException |
                 IOException e) {
            System.out.println("I/O Error.");
        }
        System.out.println("Number is " + x);
    }
}
