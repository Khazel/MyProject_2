package Lecture_4.Lecture_4;

public class StringCompare {
    public static void main(String[] args) {

        String s3 = "1234";
        String s4 = "1234";

        System.out.println(s3 == s4);

        String s5 = new String(s4);
        System.out.println("s3: " + s3 + ", s4: " + s4 + ", s5: " + s5);

        System.out.println(s4 == s5);
        System.out.println(".equals(): " + s5.equals(s4));

        s4 = "ABC";
        s5 = "abc";
        System.out.println(".equals(): " + s5.equals(s4));
        System.out.println(".equalsIgnoreCase(): " + s5.equalsIgnoreCase(s4));

        System.out.println(".compareTo(): " + s5.compareTo(s4)); // 32
        System.out.println(".compareTo(): " + s4.compareTo(s5)); // -32

        System.out.println(".compareToIgnoreCase(): " + s4.compareToIgnoreCase(s5));

        System.out.println("a".compareTo("A"));
    }
}
