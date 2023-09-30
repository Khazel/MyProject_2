package Lecture_8.Lecture_8.inheritance.animal;

public class Bird {
    private int age;
    private double weight;
    private int flyingSpeed;

    public void breathe() {
        System.out.println("I'm breathing");
    }

    public void walk() {
        System.out.println("Walk, walk, walk");
    }

    public void fly() {
        System.out.println("I'm flying");
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

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

//    @Override
//    public String toString() {
//        return "Bird{" +
//                "age=" + age +
//                ", weight=" + weight +
//                ", flyingSpeed=" + flyingSpeed +
//                '}';
//    }
}
