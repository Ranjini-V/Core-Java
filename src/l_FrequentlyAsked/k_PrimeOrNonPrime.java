package l_FrequentlyAsked;

import java.util.Scanner;

public class k_PrimeOrNonPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		// PRIME NUM = DIVISIBLE ONLY BY 1 AND THE NUM ITSELF
		// num/ (any num) % != 0

		num = Math.abs(num);
		int factor = 0;
		boolean isPrime = true;

		if (num <= 1) {
			System.out.println(num + " is less than 1 hence, not a prime number");
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
