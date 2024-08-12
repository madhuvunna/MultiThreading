package threads;

public class Sample4 implements Runnable {
	public void run() {
		System.out.println("Now the thread is running..");
	}

	public static void main(String[] args) {
		Runnable r1 = new Sample4();

		Thread th1 = new Thread(r1, "my new Thread...");
		th1.start();

		String str = th1.getName();
		System.out.println(str);
	}

}
