package l_FrequentlyAsked;

import java.util.Scanner;

public class b_ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

//		// Using Algorithm
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//
//		}

//		// Using String Buffer
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();

		// Using Wrapper Class
		String str = Integer.toString(num);
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();

		System.out.println("Reversed number is: " + rev);

	}

}
