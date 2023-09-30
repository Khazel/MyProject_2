package Lecture_8.Lecture_8.inheritance.carexample;

import java.util.Random;

public class CarSeller extends Person {

    public CarSeller(String name, long personalNumber, boolean isMale) {
        super(name, personalNumber, isMale);
    }

    public void sellCar(Car car, CarOwner buyer) {
        Random rd = new Random();
        int randomNumber = rd.nextInt(10);
        if (randomNumber % 3 == 0) {
            buyer.buyCar(car);
        } else {
            System.out.println("Sorry, no deal, ma man");
        }
    }

    public void showCar() {
        System.out.println();
    }
}
