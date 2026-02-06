package l_FrequentlyAsked;

import java.util.Scanner;

public class f_CountNumberOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num = sc.nextInt();

//		// USING STRING
//		// covert number to string
//		String num_str = Long.toString(num);
//		System.out.println("The count of characters in the number is: " + num_str.length());

		// USING ALGORITHM
		int num_len = 0;

		while (num != 0) {
			num = num / 10;
			num_len++;
		}

		System.out.println(num_len);

		/*
		 * 1234 => 123.4 => 123 (1) 123 => 12.3 => 12 (2) 12 => 1.2 (3) 1.2= > 0.12 => 0
		 *
		 */

	}

}
