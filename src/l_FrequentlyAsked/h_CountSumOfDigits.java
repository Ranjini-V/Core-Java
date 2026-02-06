package l_FrequentlyAsked;

import java.util.Scanner;

public class h_CountSumOfDigits {

	public static void main(String[] args) {

		// USING ALGORITHM

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		Integer num = sc.nextInt();

		int temp;
		int sum = 0;

		while (num > 0) {
			temp = num % 10; // 4
			sum = sum + temp; // 4
			num = num / 10; // 123
		}

		System.out.println("The Sum of Numbers is: " + sum);

	}

}
