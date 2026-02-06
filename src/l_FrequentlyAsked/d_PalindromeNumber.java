package l_FrequentlyAsked;

import java.util.Scanner;

public class d_PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		String str_num = Integer.toString(num);
		StringBuilder strb = new StringBuilder(str_num);
		StringBuilder str_rev = strb.reverse();
		System.out.println(str_rev);

		int rev_num = Integer.valueOf(str_num);

		if (rev_num == num) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}

	}

}
