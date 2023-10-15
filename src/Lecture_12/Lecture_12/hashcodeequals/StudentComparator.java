package Lecture_12.Lecture_12.hashcodeequals;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare (Student student, Student t1) {
        if(student.getId() > t1.getId()) {
            return 1;
        } else if(student.getId() < t1.getId()) {
            return -1;
        }
        return 0;
    }
}
