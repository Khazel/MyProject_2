package Lecture_13.Homework_13.WithExecutorService;

import java.io.Serializable;

class Seat implements Runnable, Serializable {
    private Car car;

    public Seat(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            System.out.println("Getting seat.");
            Thread.sleep(3000);
            System.out.println("One seat is ready.");
            car.addSeat();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
