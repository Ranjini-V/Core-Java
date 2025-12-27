package b_LoopsAndJumps;

public class DoWhileLoop {

	public static void main(String[] args) {

		// Print Numbers 1 to 5 Using do-while
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

		// Sum of Digits Using do-while

		int num = 123;
		int num_sum = 0;

		do {
			num_sum = num_sum + (num % 10);
			num = num / 10;

		} while (num > 0);

		System.out.println("sum is: " + num_sum);

		//
		int attempts = 1;
		int maxAttempts = 3;

		do {
			System.out.println("Attempt " + attempts);
			attempts++;
		} while (attempts <= maxAttempts);

		System.out.println("Account Locked");
	}

}
