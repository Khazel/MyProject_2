package Lecture_13.Homework_13.WithExecutorService;

import java.io.Serializable;

class Engine implements Runnable, Serializable {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            System.out.println("Getting engine.");
            Thread.sleep(7000);
            System.out.println("Engine is ready.");
            car.addEngine();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
