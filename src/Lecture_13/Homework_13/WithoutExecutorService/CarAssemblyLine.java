package Lecture_13.Homework_13.WithoutExecutorService;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarAssemblyLine {
    public static void main(String[] args) {
        Car car = new Car();
        boolean isFinished = false;
        AssemblyLineManager manager = new AssemblyLineManager();

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            threads.add(new Thread(new Tire(car, manager)));
        }
        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(new Seat(car, manager)));
        }
        threads.add(new Thread(new Engine(car, manager)));
        threads.add(new Thread(new Frame(car, manager)));

        int nextTaskIndex = 0;

        while (!isFinished) {
            isFinished = true;
            if (nextTaskIndex >= threads.size()) {
                break;
            }
            for (Thread thread : threads) {
                if (thread.getState() != Thread.State.TERMINATED) {
                    isFinished = false;
                    break;
                }
            }
            if (manager.getFreeAssemblyLines() > 0) {
                threads.get(nextTaskIndex).start();
                manager.useAssemblyLine();
                nextTaskIndex++;
            }
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        car.assembleCar();
        writeCarToFile(car);

        if (car.isCarAssembled()) {
            System.out.println("Car assembly complete, and the car is written to car.ser.");
        } else {
            System.out.println("Car assembly failed.");
        }
    }

    private static void writeCarToFile(Car car) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("car.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
