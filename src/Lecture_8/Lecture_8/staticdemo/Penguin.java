package Lecture_8.Lecture_8.staticdemo;

public class Penguin {
    static String color;
    private String name;
    private int age;


    int weight;

    static {
        color = "Black and white";
    }

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 2;
    }
//    public Penguin(){}

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    static void makeASound() {
        System.out.println("Penguin sound...");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
