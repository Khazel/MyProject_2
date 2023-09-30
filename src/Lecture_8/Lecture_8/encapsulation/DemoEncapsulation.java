package Lecture_8.Lecture_8.encapsulation;

import java.util.Arrays;

public class DemoEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();

        System.out.println(encapsulation.publicEncapsulation);
        System.out.println(encapsulation.defaultEncapsulation);
        System.out.println(encapsulation.protectedEncapsulation);
//        System.out.println(encapsulation.privateEncapsulation);
        encapsulation.publicEncapsulation = "Changing the value of the public field";

//        System.out.println(encapsulation.publicEncapsulation=" buy!");

        encapsulation.publicMethod();
        encapsulation.defaultMethod();

        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());
//        encapsulation.getPrivateEncapsulation("new string");
        encapsulation.setPrivateEncapsulation("New private value");
        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());

        //        encapsulation.defaultEncapsulation = "something"; not possible we have final filed (constant)

//        encapsulation.arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(encapsulation.arr));
        for (int i = 0; i < encapsulation.arr.length; i++) {
            encapsulation.arr[i] = 10;
        }
        System.out.println(Arrays.toString(encapsulation.arr));
        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);

//        encapsulation.CONSTANT_5 = 6;
    }

//    private class DemoEncapsulation2 {
//
//    }
}
