package d_Strings;

public class h_StringBuffer_ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		StringBuffer sb = new StringBuffer("B");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 50; i++) {
				sb.append("1");
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 50; i++) {
				sb.append("2");
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(sb);

	}

}
