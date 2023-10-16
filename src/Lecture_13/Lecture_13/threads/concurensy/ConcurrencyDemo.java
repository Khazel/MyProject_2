package Lecture_13.Lecture_13.threads.concurensy;

public class ConcurrencyDemo {
	static Object monitor = new Object();
	public static int sum = 0;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new Run1p();
		Thread t1 = new Thread(r1);

		Runnable r2 = new Run1m();
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		//t1.start(); // Thread t1 Dead
//        for (int i = 0; i < 10000; i++) {
//        	Thread.yield();
//        }

		System.out.println(" Main DONE, sum=" + sum);
	}
}
