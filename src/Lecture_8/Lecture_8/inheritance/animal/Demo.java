package Lecture_8.Lecture_8.inheritance.animal;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setWeight(5.25);

        cat.walk();
        cat.breathe();
        cat.climb();

        System.out.println(cat);

        Bird bird = new Bird();
        bird.setFlyingSpeed(35);
        bird.setAge(5);

        bird.fly();
        bird.walk();

        System.out.println(bird);
    }
}
