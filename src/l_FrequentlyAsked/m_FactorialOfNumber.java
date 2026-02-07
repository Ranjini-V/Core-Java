package l_FrequentlyAsked;

import java.util.Scanner;

public class m_FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double input = sc.nextDouble();
		int factorial = 1;

		if (input % 1 != 0) {
			System.out.println("Factorial is not deined for decimal numbers");
		} else if (input < 0) {
			System.out.println("Factorial is not deined for negative numbers");
		} else {

			int num = (int) input;

			for (int i = num; i >= 1; i--) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + input + " : " + factorial);
		}

		

	}
}
