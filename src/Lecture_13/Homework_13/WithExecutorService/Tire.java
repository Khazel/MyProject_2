package Lecture_13.Homework_13.WithExecutorService;

import java.io.Serializable;

class Tire implements Runnable, Serializable {
    private Car car;

    public Tire(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("Getting tire.");
        try {
            Thread.sleep(2000);
            System.out.println("One tire is ready.");
            car.addTire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
