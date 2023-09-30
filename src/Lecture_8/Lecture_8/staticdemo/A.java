package Lecture_8.Lecture_8.staticdemo;

public class A {
    public static int x = 0; // static
    public int y = 4; // non-static

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        System.out.println(x);
//        System.out.println(y);

        A a1 = new A(2, 3);
        A a2 = new A(7, 9);

        System.out.println(a1.x); //2

        sum(6, 4 );

        System.out.println(a2.y); //9
    }

    public static void sum(int a, int b){
        System.out.println((a + b));
    }
}
