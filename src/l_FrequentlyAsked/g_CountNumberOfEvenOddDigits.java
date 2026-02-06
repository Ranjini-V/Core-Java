package l_FrequentlyAsked;

import java.lang.reflect.Array;
import java.util.Scanner;

public class g_CountNumberOfEvenOddDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// USING ALGORITHM
		// GET EACH CHAR AT i'th POSITION
		// DIVIDE NUM BY 10, CAPTRE THE NUMBER IN A VARIABLE

		int even_count = 0;
		int odd_count = 0;
		int temp;

		while (num > 0) {

			temp = num % 10;

			if (temp % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;

		}

		System.out.println("Number of even numbers is: " + even_count);
		System.out.println("Number of odd numbers is: " + odd_count);

	}

}
