package Lecture_13.Homework_13.WithoutExecutorService;

import java.io.Serializable;

class Frame implements Runnable, Serializable {
    private Car car;
    private AssemblyLineManager manager;

    public Frame(Car car, AssemblyLineManager manager) {
        this.car = car;
        this.manager = manager;
    }

    @Override
    public void run() {
        try {
            System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
            System.out.println("Getting frame.");
            Thread.sleep(5000);
            System.out.println("Frame is ready.");
            car.addFrame();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            manager.releaseAssemblyLine();
            System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
        }
    }
}
