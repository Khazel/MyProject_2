package Lecture_13.Homework_13.WithExecutorService;

import java.io.Serializable;

class Frame implements Runnable, Serializable {
    private Car car;

    public Frame(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            System.out.println("Getting frame.");
            Thread.sleep(5000);
            System.out.println("Frame is ready.");
            car.addFrame();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
