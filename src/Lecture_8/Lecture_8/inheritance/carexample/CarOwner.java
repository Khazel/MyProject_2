package Lecture_8.Lecture_8.inheritance.carexample;

public class CarOwner extends Person {

    public CarOwner(String name, long personalNumber, boolean isMale) {
        super(name, personalNumber, isMale);
    }

    public void driveCar() {
        System.out.println("drive car");
    }

    public void buyCar(Car car) {
        System.out.println("We have a deal!");
        car.setOwner(this);
    }
}
