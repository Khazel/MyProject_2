package Lecture_1.Lecture_1;

public class FirstProgram {

    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println("Java!");
        System.out.println("Goodbye!");

        int age = 25;
        double price = 23.5;
        System.out.println(age);
        System.out.println(price);

        /**
            Extra
            long text
            !
         */
        char char1 = 'e'; // single character
        char char2 = 251; // ASCII
        char char3 = '\u0065'; // UNICODE

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        boolean isMe = true;
        System.out.println(isMe);

        // Extra comment
        long longNUmber = 1234545454545454545L; // use 'L' at the end
        System.out.println(longNUmber);

        float floatNumber = 1.25f; // use 'f' at the end
    }
}
