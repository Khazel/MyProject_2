package Lecture_13.Homework_13.WithoutExecutorService;

import java.io.Serializable;

class Seat implements Runnable, Serializable {
    private Car car;
    private AssemblyLineManager manager;

    public Seat(Car car, AssemblyLineManager manager) {
        this.car = car;
        this.manager = manager;
    }

    @Override
    public void run() {
        try {
            System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
            System.out.println("Getting seat.");
            Thread.sleep(3000);
            System.out.println("One seat is ready.");
            car.addSeat();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            manager.releaseAssemblyLine();
            System.out.println("Assembly lines: " + manager.getFreeAssemblyLines() + " / 3");
        }
    }
}
