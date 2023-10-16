package Lecture_13.Homework_13.WithoutExecutorService;

import java.io.Serializable;

class Tire implements Runnable, Serializable {
    private Car car;
    private AssemblyLineManager manager;

    public Tire(Car car, AssemblyLineManager manager) {
        this.car = car;
        this.manager = manager;
    }

    @Override
    public void run() {
        System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
        System.out.println("Getting tire.");
        try {
            Thread.sleep(2000);
            System.out.println("One tire is ready.");
            car.addTire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            manager.releaseAssemblyLine();
            System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
        }
    }
}
