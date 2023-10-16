package Lecture_13.Lecture_13.hashcodeequals;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare (Student student, Student student2) {
        if (student.getName().hashCode() > student2.getName().hashCode()) {
            return 1;
        } else if (student.getName().hashCode() < student2.getName().hashCode()) {
            return -1;
        }
        return 0;
    }
}
