package threads;

public class Sample extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.start();
	}

}
