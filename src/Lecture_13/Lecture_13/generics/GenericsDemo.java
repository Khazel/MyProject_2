package Lecture_13.Lecture_13.generics;

import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        PrintDouble pd = new PrintDouble(12.43);
        pd.print();

        PrintInteger pi = new PrintInteger(1233);
        pi.print();


        PrinterGenerics pgInt = new PrinterGenerics(2566);
        pgInt.print();

        PrinterGenerics<Integer> pg = new PrinterGenerics<>(25);
        pg.print();

        PrinterGenerics<Double> dbPG = new PrinterGenerics<>(14.5);
        dbPG.print();
//
//        List animals = new ArrayList<>();
        // same as using Object
        // Class cast exception if we add different object

//        call("Kalo", 25.4);
//        call(new Integer(45), true);
//
//        if (call2(true, 'c')){
//            System.out.println("Iliyan");
//        } else {
//            System.out.println("Domashno!");
//        }
//        System.out.println(call2(154L, "kjfdhnvk,jn")*487);

//         List<Integer> myIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//         callWild2(myIntList);
    }

   private static <T, W> void call(T genericType, W otherThing){
        System.out.println(genericType + " method! Other type: " + otherThing);
    }

    private static <T, V> T call2(T genericType, V otherThing){
        System.out.println(genericType + " method! Other type: " + otherThing);

        return genericType;
    }

    private static void callWild(List<Object> myList){
        System.out.println(myList);
    }

    private static void callWild2(List<?> myList){
        System.out.println(myList);
    }
}
