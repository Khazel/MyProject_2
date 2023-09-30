package Lecture_8.Lecture_8.inheritance.inheritance.animal;

public class Animal {
    private int age;
    private double weight;

    public void breathe() {
        System.out.println("I'm breathing");
    }

    public void walk() {
        System.out.println("Walk, walk, walk");
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
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
//        return """
//                Animal {
//
//
//                age = 5;
//
//
//                weight = 10;
//                }
//                """; // String block
    }
}
