package Lecture_13.Lecture_13.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " + Thread ID = " + Thread.currentThread().getId());
        processMessage();
        System.out.println("Do something in another thread.");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
