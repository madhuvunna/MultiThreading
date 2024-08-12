package threads;

public class TestSleepMethod2 {

	public static void main(String[] args) {
		try {
			for (int j = 0; j < 10; j++) {
				Thread.sleep(1000);

				System.out.println(j);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
