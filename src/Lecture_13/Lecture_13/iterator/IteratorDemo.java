package Lecture_13.Lecture_13.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        for(int i=0; i<10 ; i++){
            li.add("str"+i);
        }
        System.out.println(li);

        //ConcurrentModificationException
//        for(String st : li) {
//            if(st.equalsIgnoreCase("str3")) {
//                li.remove("str3");
//            }
//        }
//        System.out.println(li);

        Iterator<String> iter = li.iterator();
        while(iter.hasNext()) {
            if(iter.next().equalsIgnoreCase("str3")) {
                iter.remove();
            }
        }
        System.out.println(li);

    }
}
