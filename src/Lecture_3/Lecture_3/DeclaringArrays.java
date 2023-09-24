package Lecture_3.Lecture_3;

public class DeclaringArrays {
    public static void main(String[] args) {
        // Declaration
        int[] array = null;
        int array2[];

        System.out.println(array);

        // Initialization
        array = new int[10];
        System.out.println(array);

        // Declaration and Initialization
        int[] array3 = new int[10];
        int[] array4 = {5, 7, 12, -12, 0, 45};

        System.out.println("Array 1 length: " + array.length);
        // System.out.println("Array 2 length: " + array2.length);
        System.out.println("Array 3 length: " + array3.length); //10
        System.out.println("Array 4 length: " + array4.length); //6

        System.out.println(array4[5]);

        array3[0] = 10;
        array3[1] = -5;

        // ArrayIndexOutOfBoundsException
        // array3[10] = 43;
        System.out.println(array4[6]);
    }
}
