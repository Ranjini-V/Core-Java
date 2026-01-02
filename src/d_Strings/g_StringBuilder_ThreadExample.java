package d_Strings;

public class g_StringBuilder_ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		StringBuilder sb = new StringBuilder("A");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 100; i++) {
				sb.insert(0, "I");
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 300; i++) {
				sb.insert(0, "H");
			}
		});

		t1.start();
		t2.start();

		// Wait for threads to finish
		t1.join();
		t2.join();

		System.out.println(sb);
	}
}
