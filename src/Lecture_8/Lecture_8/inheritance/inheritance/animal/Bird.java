package Lecture_8.Lecture_8.inheritance.inheritance.animal;

public class Bird extends Animal {
    private int flyingSpeed;

    public void fly() {
        System.out.println("I am flying");
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void walk() {
        System.out.println("Jump, jump, jump");
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }
}
