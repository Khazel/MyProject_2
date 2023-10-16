package Lecture_13.Lecture_13.threads.concurensy;

public class Run1p implements Runnable {

	public void run() {
		int k;
		System.out.println("+ Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {

			k = ConcurrencyDemo.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ConcurrencyDemo.sum = k + 1;
			System.out.print("+");

//			synchronized (ConcurrencyDemo.monitor) {
//				k = ConcurrencyDemo.sum;
//				try {
//					Thread.sleep(1);
//				} catch (
//						InterruptedException e) {
//					e.printStackTrace();
//				}
//				ConcurrencyDemo.sum = k + 1;
//				System.out.print("+");
//			}

		}
		System.out.println(" DONE+, sum=" + ConcurrencyDemo.sum);
	}
}
