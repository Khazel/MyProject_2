package Lecture_13.Lecture_13.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.setPriority(10);
        // Start method is calling the run().
        myThread.start();

        Runnable myRunnable = new MyRunnable();
        Thread myRunThr = new Thread(myRunnable);
//        myRunThr.setPriority(1);
        myRunThr.start();


        // Thread pool demo
        System.out.println("*********************");
        ExecutorService executor = Executors.newFixedThreadPool(5); //creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            System.out.println(" --- Create worker ---");
            Runnable worker = new MyThread();
            executor.execute(worker); //calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");

    }
}
