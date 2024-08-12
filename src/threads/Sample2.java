package threads;

public class Sample2 implements Runnable{
	
	public void run() {
		System.out.println("thread is running...");
		
	}
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		Thread t1 = new Thread(s2);
		t1.start();

	}

	

}
