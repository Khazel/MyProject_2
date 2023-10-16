package Lecture_13.Lecture_13.hashcodeequals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MethodsDemo {

    public static void main(String[] args) {
        Student bobi = new Student(1, "Bobi");
        Student bobi2 = new Student(2, "Bobi");
        Student notBobi3 = new Student(2, "Dacian");

        Set<Student> students = new TreeSet<>();
//        List students = new ArrayList();
//        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(bobi);
        students.add(bobi2);
        students.add(notBobi3);
//        students.add("str");
//        students.add(1);

        System.out.println(students);

//        Integer str = (Integer) students.get(3);
//        System.out.println( 10 - str );

//        System.out.println("Bobi 1: " + bobi.hashCode());
//        System.out.println("Bobi 2: " + bobi2.hashCode());
//        System.out.println(bobi.equals(bobi2));
//        // 2077012

//        StudentComparator comparator = new StudentComparator();
//        System.out.println("comparator: " + comparator.compare(bobi,bobi2));
    }
}
