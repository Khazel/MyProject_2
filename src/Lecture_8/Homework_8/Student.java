package Lecture_8.Homework_8;

public class Student extends Person {
    private double grade;
    public Student(String firstName, String lastName, int age, String gender, double grade) {
        super(firstName, lastName, age, gender);
        this.grade = grade;
    }

    public String showStudentInfo() {
        return super.showPersonInfo() + "\n" +
                "Grade: " + this.grade + "\n";
    }
}
