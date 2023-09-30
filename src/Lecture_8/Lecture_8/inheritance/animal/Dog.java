package Lecture_8.Lecture_8.inheritance.animal;

public class Dog {
    private int age;
    private double weight;
    private boolean isDangerous;

    public void breathe() {
        System.out.println("I'm breathing");
    }

    public void walk() {
        System.out.println("Walk, walk, walk");
    }

    public void bringStick() {
        System.out.println("I've brought you a stick");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                ", isDangerous=" + isDangerous +
                '}';
    }
}
