package Lecture_12.Lecture_12.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> strArrayList = new ArrayList<>();
        strArrayList.add("Java");
        strArrayList.add(null);
        strArrayList.add(0,"First");

        System.out.println(strArrayList);

        System.out.println(strArrayList.size());

        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(11);
        intArrayList.add(-100);

        List<int[]> arrayOfArrays = new ArrayList<>();
        int[] myArr = {1,2,3,4,5,6};
        arrayOfArrays.add(myArr);
        int[] myArr2 = {1,2,3,4,5,6};
        arrayOfArrays.add(myArr2);
        System.out.println(arrayOfArrays);

        List<List<Object>> arrayOfObjects = new ArrayList<>();

        System.out.println(Arrays.toString(strArrayList.toArray()));

        try {
            strArrayList.remove(25);
        } catch (Exception e){
            System.out.println("Error!...");
        }

        strArrayList.clear();
        System.out.println(strArrayList);
    }

}
