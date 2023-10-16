package Lecture_13.Homework_13.WithoutExecutorService;

import java.io.Serializable;

class Car implements Serializable {
    private int tireCount = 0;
    private int seatCount = 0;
    private int engineCount = 0;
    private int frameCount = 0;

    synchronized void addTire() {
        tireCount++;
        System.out.println("Tire added.");
    }

    synchronized void addSeat() {
        seatCount++;
        System.out.println("Seat added.");
    }

    synchronized void addEngine() {
        engineCount++;
        System.out.println("Engine is added.");
    }

    synchronized void addFrame() {
        frameCount++;
        System.out.println("Frame is added.");
    }

    public synchronized boolean isCarAssembled() {
        return tireCount >= 4 && seatCount >= 5 && frameCount >= 1 && engineCount >= 1;
    }

    public synchronized void assembleCar() {
        while (!isCarAssembled()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
