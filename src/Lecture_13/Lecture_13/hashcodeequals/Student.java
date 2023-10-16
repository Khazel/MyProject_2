package Lecture_13.Lecture_13.hashcodeequals;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//
////        final int prime = 31;
////        int result = 1;
////        result = prime * result + id;
////        result = prime * result + ((name == null) ? 0 : name.hashCode());
////        return result;
//    }

    @Override
    public int compareTo(Student student) {
        if (this.id > student.id) {
            return 1;
        } else if (this.id < student.id) {
            return -1;
        }
        return 0;

//        if (this.name.hashCode() > student.name.hashCode()) {
//            return 1;
//        } else if (this.name.hashCode() < student.name.hashCode()) {
//            return -1;
//        }
//        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
