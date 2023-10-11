package Lecture_11.Lecture_11;

import java.util.Scanner;

public class ExceptionInterview {
    public static void main(String[] args) throws Exception {
        finalyMethodDemo();
    }

    public static void finalyMethodDemo() throws Exception {
        try(Scanner sc =new Scanner(System.in)) {
            System.out.println("Hello!");
//            throw new RuntimeException("Buy!");
            System.exit(-1);
        } catch (RuntimeException e){
            System.out.println("Exception... RT");
            throw new Exception("what about now?");
        } finally {
            System.out.println("Finally");
        }
    }
}
