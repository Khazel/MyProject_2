package Lecture_13.Lecture_13.threads;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " + Thread ID = " + Thread.currentThread().getId());
        processMessage();
        System.out.println("Do something in another thread.");
    }

    private void processMessage() {
        try {
//            while(!Thread.currentThread().isInterrupted()) {
//                Thread.sleep(2000); //milliseconds -> 2 sec.
//                Random rd = new Random();
//                System.out.println("Sleep..");
//                if (rd.nextInt(5) > 3) {
//                    Thread.currentThread().interrupt();
//                }
//            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
