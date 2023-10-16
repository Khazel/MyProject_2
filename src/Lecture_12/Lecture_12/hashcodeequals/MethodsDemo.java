package Lecture_12.Lecture_12.hashcodeequals;

public class MethodsDemo {

    public static void main(String[] args) {
        Student bobi = new Student(1, "Bobi");
        Student bobi2 = new Student(2, "Bobi");

//        System.out.println("Bobi 1: " + bobi.hashCode());
//        System.out.println("Bobi 2: " + bobi2.hashCode());
//        System.out.println(bobi.equals(bobi2));
//        // 2077012

        StudentComparator comparator = new StudentComparator();
        System.out.println("comparator: " + comparator.compare(bobi,bobi2));
    }
}
