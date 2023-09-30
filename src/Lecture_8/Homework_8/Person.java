package Lecture_8.Homework_8;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getGender(){
        return gender;
    }

    public String showPersonInfo() {
        return "First Name: " + firstName + ",\n" +
                "Last Name: " + lastName + ",\n" +
                "Age: " + age + ",\n" +
                "Gender: " + gender;
    }
}
