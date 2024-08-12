package threads;

public class TestSleepMethod extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		TestSleepMethod tsm = new TestSleepMethod();
		TestSleepMethod tsm1 = new TestSleepMethod();

		tsm.start();
		tsm1.start();
	}

}
