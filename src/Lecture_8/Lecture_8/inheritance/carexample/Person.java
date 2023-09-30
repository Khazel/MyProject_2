package Lecture_8.Lecture_8.inheritance.carexample;

public class Person {

    private int age;
    private boolean isFemale;
    private double weight;
    private double height;
    private String name;
    private Person[] friend;
    private long personalNumber;
    private boolean isMale;

    public Person() {
        age = 0;
        weight = 4.0;
        friend = new Person[10];    // this is how we save value in the heap memory
    }

    public Person(String name, long personalNumber, boolean isMale) {
        this();
        this.name = name;
        this.personalNumber = personalNumber;
        this.isMale = isMale;
        this.friend = new Person[3];
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getFriend() {
        return friend;
    }

    public void setFriend(Person[] friend) {
        this.friend = friend;
    }

    public long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am " + age + " years old!";
    }
}
