package Lecture_8.Homework_8;

public class Lector extends Person {
    private double dailySalary;
    final int experiencedLectorMinAge = 30;

    public Lector(String firstName, String lastName, int age, String gender, double dailySalary){
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }
    public String showLectorInfo() {
        return super.showPersonInfo() + "\n" +
                "Daily salary: " + this.dailySalary;
    }
    public double calculateOvertime(double hours) {
        double overtimeAmout = 0;
        if (getAge() >= experiencedLectorMinAge) {
            overtimeAmout += (hours * (dailySalary * 2));
        }
        return overtimeAmout;
    }
}
