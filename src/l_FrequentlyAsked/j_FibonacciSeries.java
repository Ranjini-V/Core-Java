package l_FrequentlyAsked;

import java.util.Scanner;

public class j_FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the series:");
		int len = sc.nextInt();

		int[] fib = new int[len];

		fib[0] = 0;

		if (len > 1) {
			fib[1] = 1;
		}

		for (int i = 2; i < len; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

		}

		for (int i = 0; i < len; i++) {
			System.out.print(fib[i] + ", ");
		}

	}

}
