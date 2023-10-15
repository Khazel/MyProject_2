package Lecture_12.Lecture_12.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(32);
        linkedList.add(12);
        linkedList.add(1, 10);

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

        List<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(2111);
        linkedList2.add(32111);
        linkedList2.add(12111);

        linkedList.addAll(linkedList2);
        System.out.println(linkedList);
    }
}
