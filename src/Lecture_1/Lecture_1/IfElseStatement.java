package Lecture_1.Lecture_1;

public class IfElseStatement {
    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }
        }

        // First mistake
//        int c = 7;
//        if (c > 10); {
//            System.out.println("c is " + c);
//            System.out.println("c is bigger than 10");
//        }

        int c1 = 7;
        if (c1 > 10)
            System.out.println("c is " + c1);
            System.out.println("c is bigger then 10");

        int d = -7;
        if (d == 1) {

        } else {
            System.out.println("d is bigger than 1");
        }

        /**
         * ---------------------------------------------------------------
         * 3. Logical operators
         * ---------------------------------------------------------------
         *
         * - logical AND
         * - logical OR
         * - logical XOR (exclusive or)
         * - logical NOT
         * |    A   |    B   |   A && B  |   A || B  |   A ^ B   |   !A  |
         * |--------|--------|-----------|-----------|-----------|-------|
         * |  true  |  true  |   true    |    true   |   false   | false |
         * |  true  |  false |   false   |    true   |   true    | false |
         * |  false |  true  |   false   |    true   |    true   | true  |
         * |  false |  false |   false   |    false  |   false   | true  |
         * ---------------------------------------------------------------
         */
        c1 = 5;
        if ( !(true ^ true) ){
            System.out.println("XOR");
        }

        if ((c1 >= 5) && !(c1 > 10)) {
            System.out.println("Hello");
        }

        if ((c1 < 10 ) || (c1 > 100)){
            System.out.println("Buy!");
        }


    }
}
