package Lecture_3.Lecture_3;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        // defining arrays to be compared
        int[] a1 = new int[] {1, 9, 3, 4};
        int[] a2 = new int[] {1, 9, 3, 4};

        if (a1 == a2) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
        System.out.println(a1);
        System.out.println(a2);

        if (a1.equals(a2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

        // *******************************
        // using out code
        boolean areSame = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]){
                    areSame = false;
                    break;
                }
            }
        } else {
            areSame = false;
        }
        System.out.println("Are same: " + areSame);

        // Using Arrays.equals
        if (Arrays.equals(a1, a2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

        // Corner case
        int inarr1[] = {1, 2, 3, 4};
        int inarr2[] = {1, 2, 3, 4};
        Object[] arr1 = {inarr1}; // arr1 contains only one element
        Object[] arr2 = {inarr2}; // arr2 also contains only one element

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Same using Arrays.equals");
        } else {
            System.out.println("Not same using Arrays.equals");
        }

        if (Arrays.deepEquals(arr1, arr2)) {
            System.out.println("Same using Arrays.deepEquals");
        } else {
            System.out.println("Not same using Arrays.deepEquals");
        }

        // ***********************************************
        a1 = new int[] {1, 9, 3, 4};
        a2 = new int[] {1, 92, -3, 14, 75, 81};
        System.out.println("a1 -> " + Arrays.toString(a1));
        System.out.println("a2 -> " + Arrays.toString(a2));

        a1 = a2;
        a2[2] = 100;

        System.out.println("a1 -> " + Arrays.toString(a1));
        System.out.println("a2 -> " + Arrays.toString(a2));

    }
}
