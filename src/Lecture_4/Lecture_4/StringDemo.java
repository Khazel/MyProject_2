package Lecture_4.Lecture_4;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {

        char[] ch = {'j','a','v','a'};
        System.out.println("ch = " + ch);
        System.out.println("ch = " + Arrays.toString(ch));

        String s = new String(ch);
        System.out.println("s = " + s);

        String s1 = "java";
        System.out.println("s1 = " + s1);

        String s2 = new String("java");
        System.out.println("s2 = " + s2);

        String s3 = "1234";
        System.out.println("s3 = " + s3);
        String s4 = new String(s3);
        System.out.println("s4 = " + s4);

    }
}
