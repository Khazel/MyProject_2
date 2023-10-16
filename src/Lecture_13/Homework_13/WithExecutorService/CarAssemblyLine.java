package Lecture_13.Homework_13.WithExecutorService;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CarAssemblyLine {
    public static void main(String[] args) {
        Car car = new Car();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 4; i++) {
            executor.submit(new Thread(new Tire(car)));
        }
        for (int i = 0; i < 5; i++) {
            executor.submit(new Thread(new Seat(car)));
        }
        executor.submit(new Thread(new Engine(car)));
        executor.submit(new Thread(new Frame(car)));

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

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
