package Lecture_8.Lecture_8.inheritance.inheritance.animal;

public class Dog extends Animal {
    private boolean isDangerous;

    public void bringStick() {
        System.out.println("I've brought you a stick");
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
