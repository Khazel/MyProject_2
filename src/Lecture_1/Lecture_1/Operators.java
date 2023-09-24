package Lecture_1.Lecture_1;

public class Operators {

    public static void main(String[] args) {
        //addition / subtraction
        int a = 10;
        int b = 5;

        System.out.println(a+b);
        int result = a-b;
        System.out.println(result);

        // division / multiplication
        int c = 10;
        int d = 5;
        System.out.println(c / d);
        System.out.println(c * d);

        // modulus/ remaining
        System.out.println(7 % 5);
        System.out.println(10 % 5);
        System.out.println(11 % 3);

        // ++ -> number + 1
        // -- -> number - 1
        System.out.println(c++); // returning the value; incrementing with 1 -> c = 11
        System.out.println(++c); // incrementing c from 11 to 12 and returning it

         int predecrement = 10;
         System.out.println(--predecrement);

         int postdecrement = 10;
         System.out.println(postdecrement--);

         int x = 5;
         int y = 3;
         int z = 4;
         System.out.println(++x + x++); // 12

        // x++ + ++y - --z + (z-- + x + y++) + x++ + ++y + z--
        // 7   +  4  -  3  + (3   + 8 +  4 ) +  8  +  6  + 2 = 39
        System.out.println(x++ + ++y - --z + (z-- + x + y++) + x++ + ++y + z--);
        System.out.println(x); // 9
        System.out.println(y); // 6
        System.out.println(z); // 1

        z+=10; // z = z + 10;
        y-=5;
        System.out.println(z);
        System.out.println(y); // 1

        int e = 5;
        int r = 5;
        System.out.println(e == r); // true
        System.out.println(e != r); // false
        System.out.println(7 != 8); // true

        int t = 7;
        int o = 9;
        System.out.println(t > o); // false
        System.out.println(t >= o); // false
        System.out.println(t < o); // true
        System.out.println(t <= o); // true
        System.out.println(9 <= 9); //true


        boolean a1 = true;
        int b1 = (a1 == true) ? 10 : 7;
        System.out.println(b1);

//          int b;
//
//          if (a == true) {
//             b = 10;
//          } else {
//             b = 7;
//          }
    }
}
