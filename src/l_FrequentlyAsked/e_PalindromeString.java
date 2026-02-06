package l_FrequentlyAsked;

import java.util.Scanner;

public class e_PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str_input = sc.next();

		StringBuilder sb = new StringBuilder(str_input);
		StringBuilder rev_str = sb.reverse();

		if ((rev_str.toString()).equals(str_input)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Plaindrome");
		}

	}

}
