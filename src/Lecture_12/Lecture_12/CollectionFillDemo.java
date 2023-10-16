package Lecture_12.Lecture_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFillDemo {
    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<>();
        // Add elements in the list
        arrlist.add("AAA");
        arrlist.add("BBB");
        arrlist.add("CCC");
        arrlist.add("AAA");
        arrlist.add("BBB");
        arrlist.add("CCC");
        arrlist.add("AAA");
        arrlist.add("BBB");
        arrlist.add("CCC");
        System.out.println(arrlist);

        Collections.fill(arrlist, "Java");
        System.out.println(arrlist);
    }
}
