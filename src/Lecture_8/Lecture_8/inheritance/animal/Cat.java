package Lecture_8.Lecture_8.inheritance.animal;

public class Cat {

    private int age;
    private double weight;

    public void breathe() {
        System.out.println("I'm breathing");
    }

    public void walk() {
        System.out.println("Walk, walk, walk");
    }

    public void climb() {
        System.out.println("I'm climbing");
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

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
