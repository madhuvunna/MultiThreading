package threads;

class ThreadJoin extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name is:" + Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println("The exception has bee caught:" + e);
			}
			System.out.println(i);
		}
	}
}

public class TestJoinMethod {
	public static void main(String[] args) {
		ThreadJoin tjm = new ThreadJoin();
		ThreadJoin tjm1 = new ThreadJoin();
		ThreadJoin tjm2 = new ThreadJoin();

		tjm.start();

		try {
			System.out.println("The current thread name is:" + Thread.currentThread().getName());
			tjm.join();
		} catch (Exception e) {
			System.out.println("The exception has been caught:" + e);
		}
		tjm1.start();

		try {
			System.out.println("The current thread name is:" + Thread.currentThread().getName());
			tjm1.join();
		} catch (Exception e) {
			System.out.println("The exception has been caught:" + e);
		}
		tjm2.start();

	}

}
